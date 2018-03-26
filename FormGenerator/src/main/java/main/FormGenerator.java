package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by wijaya on 3/24/2018.
 */
public class FormGenerator {
    public static void main(String[] args){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Item item = new Item();
        ObjectReader objectReader = new ObjectReader();
        System.out.println(objectReader.read(item));
        System.out.print(gson.toJson(item));
    }
}
