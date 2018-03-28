package main.ArisanForm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wijaya on 3/24/2018.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) //can use in method only.
public @interface Form {
    Type type() default Type.TEXT;
    String[] list() default {};
    boolean confirm() default false;
    int viewType() default 0;

    enum Type {
        TEXT,PASSWORD,NUMBER,CHECKBOX,RADIO,NONE,DATE,TIME;
    }
}
