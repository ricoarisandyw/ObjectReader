package main.ObjectReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.ObjectReader.helper.ObjectReader;
import main.ObjectReader.model.FieldDetail;
import main.ObjectReader.model.FieldFiller;
import main.ObjectReader.model.Item;
import main.ObjectReader.model.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wijaya on 3/24/2018.
 */
public class FormGenerator {


    public static void main(String[] args){
        GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();

        List<Item> itemList = new ArrayList<Item>();

        Item item = new Item();
        item.setName("Sword");
        item.setDamage(1000);
        itemList.add(item);

        Item item2 = new Item();
        item2.setName("Bow");
        item2.setDamage(2000);
        itemList.add(item2);

        Player player = new Player();
        List<FieldDetail> fieldDetails = ObjectReader.getFieldName(player);
        FieldFiller.fill(fieldDetails, "items", itemList);
        FieldFiller.fill(fieldDetails, "name", "Rico");

        List<Item> items = (List<Item>) FieldFiller.find(fieldDetails,"items").getData();

        System.out.println(gson.toJson(fieldDetails));

        System.out.println("\n"+gson.toJson(items));

        //TODO : Make FieldDetails as parameter
        new FormAdapter().setObject(player,fieldDetails, new FormAdapter.OnResponse() {
            public void response(Object response) {
                System.out.println("Result : "+gson.toJson(response));
            }
        });
    }
}
