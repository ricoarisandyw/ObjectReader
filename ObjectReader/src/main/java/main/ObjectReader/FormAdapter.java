package main.ObjectReader;

import main.ObjectReader.helper.ObjectSetter;
import main.ObjectReader.model.FieldDetail;

import java.util.List;

/**
 * Created by wijaya on 3/26/2018.
 */
public class FormAdapter<T>{
    T t;

    public void setObject(Object o,List<FieldDetail> fieldDetailList, OnResponse onResponse){
        ObjectSetter objectSetter;
        String str = "example";
        int ex = 17;

        for(FieldDetail f: fieldDetailList){
            String x = String.valueOf(String.class.getCanonicalName());
            if(f.getFieldType().equals(x)){
                ObjectSetter.set(o,f.getName(),str);
            }else if(f.getFieldType().equals(String.valueOf(boolean.class))){
                ObjectSetter.set(o,f.getName(),true);
            }else if(f.getFieldType().equals(String.valueOf(int.class))){
                ObjectSetter.set(o,f.getName(),1000);
            }else if(f.getFieldType().equals(String.valueOf(String.class))){

            }
        }

        onResponse.response(o);
    }

    public interface OnResponse<T>{
        public void response(T response);
    }
}
