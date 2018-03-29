package main.ObjectReader.model;

import main.ObjectReader.annotation.Form;

import java.util.List;

/**
 * Created by wijaya on 3/24/2018.
 */
public class Item{

    @Form
    int id;

    @Form(type = Form.ViewType.PASSWORD)
    private String name;

    @Form(type = Form.ViewType.NUMBER)
    private int damage;

    private boolean wearable;

    private List<String> skill;

    public Item() {
    }

    public Item(int id, String name, int damage, boolean wearable, List<String> skill) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.wearable = wearable;
        this.skill = skill;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isWearable() {
        return wearable;
    }

    public void setWearable(boolean wearable) {
        this.wearable = wearable;
    }

    public List<String> getSkill() {
        return skill;
    }

    public void setSkill(List<String> skill) {
        this.skill = skill;
    }
}
