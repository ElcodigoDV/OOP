package units;

import java.util.ArrayList;

public abstract class units{
    this.public float maxHP, curHP;
    this.int att, def;
    this.int[] damage;
    this.String name;
}
public class units {

    public int health;
    public int defence;
    public int mana;
    public boolean haveMana;
    public int actionPoint;
    public int initiative;
    public int damage;
    public String name;

    public units(int health, int defence, int mana, int actionPoint, int initiative, int damage, String name) {
        this.health = health;
        this.defence = defence;
        this.mana = mana;
        this.actionPoint = actionPoint;
        this.initiative = initiative;
        this.damage = damage;
        this.name = name;
    }

    public boolean hasAP(){
        if (actionPoint > 0){
            return true;
        }
        else return false;
    }


    public int move(){
        while (hasAP()){

        }
    }
    String getInfo(){
        return this.name;
}


