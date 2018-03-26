package main.ArisanForm;

import main.ArisanForm.annotation.Form;

/**
 * Created by wijaya on 3/24/2018.
 */
public class Item{
    @Form(type = Form.Type.PASSWORD)
    private String name;
    private int damage;
    private boolean wearable;

    public Item() {
    }

    public Item(String name, int damage, boolean wearable) {
        this.name = name;
        this.damage = damage;
        this.wearable = wearable;
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
}
