package main.ArisanForm;

import main.ArisanForm.helper.ObjectReader;
import main.ArisanForm.helper.ObjectSetter;

import java.util.List;

/**
 * Created by wijaya on 3/26/2018.
 */
public class ArisanForm<T>{
    T t;

    public void setObject(Object o,OnResponse onResponse){
        ObjectSetter objectSetter;
        String str = "example";
        int ex = 17;

        List<FieldDetail> fieldDetailList = ObjectReader.getFieldName(o);

        for(FieldDetail f: fieldDetailList){
            if(f.getType().equals("java.lang.String")){
                ObjectSetter.set(o,f.name,str);
            }else if(f.getType().equals("boolean")){
                ObjectSetter.set(o,f.name,true);
            }else {
                ObjectSetter.set(o,f.name,1000);
            }
        }

        onResponse.response(o);
    }

    public interface OnResponse<T>{
        public void response(T response);
    }
}
