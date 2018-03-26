package main;

import main.annotation.Form;

/**
 * Created by wijaya on 3/24/2018.
 */
public class Item{
    @Form(type = Form.FormType.PASSWORD)
    private String name;

    private int damage;
    private boolean wearable;
    private String[] role;

    public Item() {
    }

    public Item(String name, int damage, boolean wearable, String[] role) {
        this.name = name;
        this.damage = damage;
        this.wearable = wearable;
        this.role = role;
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

    public String[] getRole() {
        return role;
    }

    public void setRole(String[] role) {
        this.role = role;
    }
}
