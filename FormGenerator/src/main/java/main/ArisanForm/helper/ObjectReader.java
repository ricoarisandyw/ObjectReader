package main.ArisanForm.helper;

import main.ArisanForm.FieldDetail;
import main.ArisanForm.annotation.Form;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wijaya on 3/24/2018.
 */
public class ObjectReader {
    public String read(Object o) {
        String result = "";
        result += o.getClass().toString();
        Field[] fields = o.getClass().getFields();
        for (Field f : fields) {
            result += "\nFields " + f.getName();
            if (f.isAnnotationPresent(Form.class)) {

            }
        }
        Field[] declaredField = o.getClass().getDeclaredFields();
        for (Field f : declaredField) {
            if (f.isAnnotationPresent(Form.class)) {
                Annotation annotation = f.getAnnotation(Form.class);
                Form form = (Form) annotation;

                result += "\nAnnotation Data Type : " + form.type();
            }
            result += "\nDeclared " + f.getType().getName() + " " + f.getName();
        }
        /*Class<Object> objectClass = (Class<Object>) o.getClass();
        Method[] method = objectClass.getDeclaredMethods();
        for(Method m : method){
            result += "\nMethod "+ m.getName();
        }*/
        return result;
    }

    public static List<FieldDetail> getFieldName(Object o) {

        Class<Object> objectClass = (Class<Object>) o.getClass();
        Method[] method = objectClass.getDeclaredMethods();
        List<FieldDetail> detailList = new ArrayList<FieldDetail>();
        Field[] declaredField = o.getClass().getDeclaredFields();
        for (Field f : declaredField) {
            if (f.isAnnotationPresent(Form.class)) {
                FieldDetail fieldDetail = new FieldDetail();
                Annotation annotation = f.getAnnotation(Form.class);
                Form form = (Form) annotation;

                fieldDetail.setAnnotation(form.type().name());
                fieldDetail.setConfirm(form.confirm());
                fieldDetail.setList(Arrays.asList(form.list()));
                for (Method m : method) {
                    if (
                            m.getName().toLowerCase().equals("get" + f.getName().toLowerCase()) ||
                                    m.getName().toLowerCase().equals("is" + f.getName().toLowerCase())
                            )
                        try {
                            fieldDetail.setValue(m.invoke(o));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                }
                fieldDetail.setViewType(0);

                fieldDetail.setName(f.getName());
                fieldDetail.setType(f.getType().getName());

                detailList.add(fieldDetail);
            }
        }
        return detailList;
    }
}
