package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.helper.ObjectSetter;
import main.helper.ObjectReader;

/**
 * Created by wijaya on 3/24/2018.
 */
public class FormGenerator {


    public static void main(String[] args){
        GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();

        Item item = new Item();
        System.out.println(gson.toJson(ObjectReader.getFieldName(item)));

        new ArisanForm().setObject(item, new ArisanForm.OnResponse() {
            public void response(Object response) {
                System.out.println(gson.toJson(response));
            }
        });
    }
}
