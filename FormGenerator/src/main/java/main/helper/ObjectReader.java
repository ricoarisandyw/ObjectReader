package main.helper;

import main.FieldDetail;
import main.annotation.Form;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Created by wijaya on 3/24/2018.
 */
public class ObjectReader {
    public String read(Object o){
        String result = "";
        result += o.getClass().toString();
        Field[] fields = o.getClass().getFields();
        for(Field f:fields){
            result+= "\nFields " + f.getName();
            if(f.isAnnotationPresent(Form.class)){

            }
        }
        Field[] declaredField = o.getClass().getDeclaredFields();
        for(Field f:declaredField){
            if(f.isAnnotationPresent(Form.class)){
                Annotation annotation = f.getAnnotation(Form.class);
                Form form = (Form) annotation;

                result+= "\nAnnotation Data Type : " + form.type();
            }
            result+= "\nDeclared " + f.getType().getName() +" "+ f.getName();
        }
        /*Class<Object> objectClass = (Class<Object>) o.getClass();
        Method[] method = objectClass.getDeclaredMethods();
        for(Method m : method){
            result += "\nMethod "+ m.getName();
        }*/
        return result;
    }

    public static List<FieldDetail> getFieldName(Object o){
        List<FieldDetail> detailList = new ArrayList<FieldDetail>();
        Field[] declaredField = o.getClass().getDeclaredFields();
        for(Field f:declaredField){
            FieldDetail fieldDetail = new FieldDetail();
            if(f.isAnnotationPresent(Form.class)){
                Annotation annotation = f.getAnnotation(Form.class);
                Form form = (Form) annotation;
                fieldDetail.setAnnotation(form.type().name());
            }
            fieldDetail.setName(f.getName());
            fieldDetail.setType(f.getType().getName());
            detailList.add(fieldDetail);
        }
        return detailList;
    }
}
