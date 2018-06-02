package com.company.mateuszstempak;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {

    private static int iterator;
    private static int total;

    public DeluxeBurger(Items meat, Items bread, ArrayList<Items> additions) {
        super(meat, bread, additions);
    }

    public void setMeat(Items item) {
        this.total += item.getPrice();
        super.setMeat(item);
    }

    public void setBread(Items item) {
        this.total += item.getPrice();
        super.setBread(item);
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public void addAddition(Items item) {
        if(super.getAdditions().size() < 2) {
            if (item == Items.CHIPS || item == Items.FRENCH_FRIES || item == Items.TEA
                    || item == Items.COFFEE || item == Items.BEER) {
                super.getAdditions().add(item);
                this.total += item.getPrice();
                this.iterator += 1;
            }
            else {
                System.out.println("You have to choose among chips, fries or drinks.");
            }

            if(super.getAdditions().size() == 2) {
                super.getAdditions().trimToSize();
            }

            else if(iterator > 2) {
                this.total -= item.getPrice();
                System.out.println("\nYou can't add another additional item. All of them have been chosen.");
            }
        }
    }

    @Override
    public void modifyAddition(int position, Items item) {
        position -= 1;
        System.out.println(getClass().getSimpleName() + ": Modifying your " + super.getAdditions().get(position).getItemName() + " additional item into...");
        this.total -= super.getAdditions().get(position).getPrice();

        if (item == Items.CHIPS || item == Items.FRENCH_FRIES || item == Items.TEA
                || item == Items.COFFEE || item == Items.BEER) {
            super.getAdditions().set(position, item);
        }
        else {
            System.out.println("You have to choose among chips, fries or drinks.");
        }

        System.out.println(super.getAdditions().get(position).getItemName() + " at position: " + (position + 1) + ".\nDone!\n");
        this.total += super.getAdditions().get(position).getPrice();
    }

    @Override
    public void printOrder() {

        System.out.println("\t\t\t---YOUR ORDER---");
        System.out.println("1. Meat: " + super.getMeat().getItemName() + " " + super.getMeat().getPrice() + " PLN.");
        System.out.println("2. Bread: " + super.getBread().getItemName() + " " + super.getBread().getPrice() + " PLN.");
        System.out.println("3. Chips item: " + super.getAdditions().get(0).getItemName() + " " + super.getAdditions().get(0).getPrice() + " PLN.");
        System.out.println("4. Drink item: " + super.getAdditions().get(1).getItemName() + " " + super.getAdditions().get(1).getPrice() + " PLN.");

        System.out.println("\nTOTAL: " + getTotal() + " PLN.");

    }
}
