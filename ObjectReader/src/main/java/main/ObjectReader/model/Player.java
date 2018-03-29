package main.ObjectReader.model;

import main.ObjectReader.annotation.Form;

import java.util.List;

/**
 * Created by wijaya on 3/28/2018.
 */
public class Player {
    int id;

    @Form(type = Form.ViewType.CHECKBOX,mode = Form.Mode.Choice,relation = Form.Relation.Multi)
    String name;

    @Form(relation = Form.Relation.Single)
    List<Item> items;

    public Player() {
    }

    public Player(int id, String name, List<Item> items) {
        this.id = id;
        this.name = name;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
