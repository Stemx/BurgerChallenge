package com.company.mateuszstempak;

import java.util.ArrayList;

public class Hamburger extends Burger {

    private static int iterator;
    private static int total;

    public Hamburger(Items meat, Items bread, ArrayList<Items> additions) {
        super(meat, bread, additions);
    }

    public void printOrder() {
        System.out.println("\t\t\t---YOUR ORDER---");
        System.out.println("1. Meat: " + super.getMeat().getItemName() + " " + super.getMeat().getPrice() + " PLN.");
        System.out.println("2. Bread: " + super.getBread().getItemName() + " " + super.getBread().getPrice() + " PLN.");
        System.out.println("3. First item: " + super.getAdditions().get(0).getItemName() + " " + super.getAdditions().get(0).getPrice() + " PLN.");
        System.out.println("4. Second item: " + super.getAdditions().get(1).getItemName() + " " + super.getAdditions().get(1).getPrice() + " PLN.");
        System.out.println("5. Third item: " + super.getAdditions().get(2).getItemName() + " " + super.getAdditions().get(2).getPrice() + " PLN.");
        System.out.println("6. Fourth item: " + super.getAdditions().get(3).getItemName() + " " + super.getAdditions().get(3).getPrice() + " PLN.");

        System.out.println("\nTOTAL: " + Hamburger.getTotal() + " PLN.");
    }

    public void addAddition(Items item) {

        if(super.getAdditions().size() < 5) {
            super.getAdditions().add(item);
            this.total += item.getPrice();
            this.iterator += 1;
            if(super.getAdditions().size() == 4) {
                super.getAdditions().trimToSize();
            }

            else if(iterator > 4) {
                this.total -= item.getPrice();
                System.out.println("\nYou can't add another additional item. All of them have been chosen.");
            }
        }
    }

    public void modifyAddition(int position, Items item) {
        System.out.println("Modifying your " + super.getAdditions().get(position).getItemName() + " additional item into...");
        this.total -= super.getAdditions().get(position).getPrice();
        super.getAdditions().set(position, item);
        System.out.println(super.getAdditions().get(position).getItemName() + " at position: " + (position + 1) + ".\nDone!\n");
        this.total += super.getAdditions().get(position).getPrice();
        System.out.println("Meat, bread and 4 additions.");
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Hamburger.total = total;
    }

    @Override
    public Items getMeat() {
        return super.getMeat();
    }

    @Override
    public void setMeat(Items meat) {
        this.total += meat.getPrice();
        super.setMeat(meat);
    }

    @Override
    public Items getBread() {
        return super.getBread();
    }

    @Override
    public void setBread(Items bread) {
        this.total += bread.getPrice();
        super.setBread(bread);
    }

    public static int getIterator() {
        return iterator;
    }
}
