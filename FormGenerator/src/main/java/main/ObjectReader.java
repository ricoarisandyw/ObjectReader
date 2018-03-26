package main;

import main.annotation.Form;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
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

                Annotation[] annotations = f.getDeclaredAnnotations().clone();
                for(Annotation a : annotations){
                    result+= "\nAnnotation" + a.toString();
                }
                result+= "\nAnnotation Data Type : " + form.type();
                result+= "\nAnnotation Data Value : " + form.value();
            }
            result+= "\nDeclared " + f.getType().getName() +" "+ f.getName();
        }
        Class<Object> objectClass = (Class<Object>) o.getClass();
        Method[] method = objectClass.getDeclaredMethods();
        for(Method m : method){
            result += "\nMethod "+ m.getName();
        }
        return result;
    }
}
