package com.company.mateuszstempak;

import java.util.ArrayList;

public abstract class Burger {

    private static int total;
    private static int iterator;
    private Items meat;
    private Items bread;
    private ArrayList <Items> additions;

    public Burger(Items meat, Items bread, ArrayList<Items> additions) {
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

    public ArrayList<Items> getAdditions() {
        return additions;
    }

    public void setAdditions(ArrayList<Items> additions) {
        this.additions = additions;
    }
}
