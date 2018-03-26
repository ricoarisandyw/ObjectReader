package main;

import java.util.List;

/**
 * Created by wijaya on 3/26/2018.
 */
public class FieldDetail {
    String type;
    String name;
    String annotation;

    public FieldDetail() {
    }

    public FieldDetail(String type, String name, String annotation) {
        this.type = type;
        this.name = name;
        this.annotation = annotation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }
}
