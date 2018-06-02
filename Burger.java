package com.company.mateuszstempak;

import java.util.ArrayList;

//Superclass for Hamburger, DeluxeBurger, HealthyBurger
public abstract class Burger {

    private Items meat;
    private Items bread;
    private ArrayList <Items> additions;

    Burger(Items meat, Items bread, ArrayList<Items> additions) {
        this.meat = meat;
        this.bread = bread;
        this.additions = additions;
    }

    public abstract void addAddition(Items item);
    public abstract void modifyAddition(int position, Items item);
    public abstract void printOrder();

    public Items getMeat() {
        return meat;
    }

    public void setMeat(Items meat) {
        this.meat = meat;
    }

    public Items getBread() {
        return bread;
    }

    public void setBread(Items bread) {
        this.bread = bread;
    }

    ArrayList<Items> getAdditions() {
        return additions;
    }
}
