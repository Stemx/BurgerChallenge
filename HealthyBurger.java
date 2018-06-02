package com.company.mateuszstempak;

import java.util.ArrayList;

public class HealthyBurger extends Burger {

    private static int iterator;
    private static int total;

    public HealthyBurger(Items meat, ArrayList<Items> additions) {
        super(meat, Items.BROWN_RYE_BREAD, additions);
        this.total += Items.BROWN_RYE_BREAD.getPrice();
    }

    @Override
    public void addAddition(Items item) {

        if (item == Items.TEA || item == Items.BEER || item == Items.COFFEE || item == Items.CHIPS || item == Items.FRENCH_FRIES ) {
            System.out.println(item.getItemName() + ": You cannot choose this items!");
        }
        else if(super.getAdditions().size() < 6) {
            super.getAdditions().add(item);
            this.total += item.getPrice();
            this.iterator += 1;
        }

        if(super.getAdditions().size() == 6) {
            super.getAdditions().trimToSize();
        }
        else if(iterator > 6) {
            this.total -= item.getPrice();
            System.out.println("\nYou can't add another additional item. All of them have been chosen.");
        }
    }

    @Override
    public void modifyAddition(int position, Items item) {
        position -= 1;
        System.out.println(getClass().getSimpleName() + ": Modifying your " + super.getAdditions().get(position).getItemName() + " additional item into...");
        this.total -= super.getAdditions().get(position).getPrice();

        if (item == Items.CHIPS || item == Items.FRENCH_FRIES || item == Items.TEA
                || item == Items.COFFEE || item == Items.BEER) {
            System.out.println(item.getItemName() + ": You cannot choose this item!");
        }
        else {
            super.getAdditions().set(position, item);
        }

        System.out.println(super.getAdditions().get(position).getItemName() + " at position: " + (position + 1) + ".\nDone!\n");
        this.total += super.getAdditions().get(position).getPrice();
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public void printOrder() {

        System.out.println("\t\t\t---YOUR ORDER---");
        System.out.println("1. Meat: " + super.getMeat().getItemName() + " " + super.getMeat().getPrice() + " PLN.");
        System.out.println("2. Bread: " + super.getBread().getItemName() + " " + super.getBread().getPrice() + " PLN.");
        System.out.println("3. First item: " + super.getAdditions().get(0).getItemName() + " " + super.getAdditions().get(0).getPrice() + " PLN.");
        System.out.println("4. Second item: " + super.getAdditions().get(1).getItemName() + " " + super.getAdditions().get(1).getPrice() + " PLN.");
        System.out.println("5. Third item: " + super.getAdditions().get(2).getItemName() + " " + super.getAdditions().get(2).getPrice() + " PLN.");
        System.out.println("6. Fourth item: " + super.getAdditions().get(3).getItemName() + " " + super.getAdditions().get(3).getPrice() + " PLN.");
        System.out.println("7. Fifth item: " + super.getAdditions().get(4).getItemName() + " " + super.getAdditions().get(4).getPrice() + " PLN.");
        System.out.println("8. Sixth item: " + super.getAdditions().get(5).getItemName() + " " + super.getAdditions().get(5).getPrice() + " PLN.");


        System.out.println("\nTOTAL: " + getTotal() + " PLN.");
    }

    @Override
    public void setBread(Items bread) {
        System.out.println("Sorry, you cannot set another bread.");
        super.setBread(Items.BROWN_RYE_BREAD);
    }

    @Override
    public void setMeat(Items meat) {
        this.total += meat.getPrice();
        super.setMeat(meat);
    }
}
