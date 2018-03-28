package main.ArisanForm;

import java.util.List;

/**
 * Created by wijaya on 3/26/2018.
 */
public class FieldDetail {
    String type;
    String name;
    String annotation;
    List<String> list;
    boolean confirm;
    int viewType;
    Object value;

    public FieldDetail() {
    }

    public FieldDetail(String type, String name, String annotation, List<String> list, boolean confirm, int viewType, Object value) {
        this.type = type;
        this.name = name;
        this.annotation = annotation;
        this.list = list;
        this.confirm = confirm;
        this.viewType = viewType;
        this.value = value;
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

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
