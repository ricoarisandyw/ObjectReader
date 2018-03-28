package main.ArisanForm;

import main.ArisanForm.annotation.Form;

import java.util.List;

/**
 * Created by wijaya on 3/24/2018.
 */
public class Item{
    @Form(type = Form.Type.PASSWORD,list = {"Rico","Arisandy","Wijaya"})
    private String name;

    @Form(type = Form.Type.NUMBER)
    private int damage;

    private boolean wearable;

    private List<String> skill;

    public Item() {
    }

    public Item(String name, int damage, boolean wearable, List<String> skill) {
        this.name = name;
        this.damage = damage;
        this.wearable = wearable;
        this.skill = skill;
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
