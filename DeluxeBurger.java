package com.company.mateuszstempak;

import java.util.ArrayList;

//inheritance from abstract class Burger
public class DeluxeBurger extends Burger {

    //static fields for int iterator which helps counting additions and total to sum up the price
    private static int iterator;
    private static int total;

    //constructor for DeluxeBurger
    DeluxeBurger(Items meat, Items bread, ArrayList<Items> additions) {
        super(meat, bread, additions);
    }

    //setters for meat and bread
    public void setMeat(Items item) {
        total += item.getPrice();
        super.setMeat(item);
    }

    public void setBread(Items item) {
        total += item.getPrice();
        super.setBread(item);
    }

    //sum of prices
    private static int getTotal() {
        return total;
    }

    //In this class you can put 2 additional items to create a burger so first 'if' is to get an addition if there is ArrayList index
    //less than 2 (0, 1). If it is correct a method checks if user choose proper items (if user choose wrong one there is a message).
    // Then it is adding it to ArrayList and adding price of item to total. Iterator is incremented by 1.

    //If ArrayList have two items it is trimmed to it's size. If iterator is higher than 2 there is a message that you
    @Override
    public void addAddition(Items item) {
        if(super.getAdditions().size() < 2) {
            if (item == Items.CHIPS || item == Items.FRENCH_FRIES || item == Items.TEA
                    || item == Items.COFFEE || item == Items.BEER) {
                super.getAdditions().add(item);
                total += item.getPrice();
                iterator += 1;
            }
            else {
                System.out.println("You have to choose among chips, fries or drinks.");
            }

            if(super.getAdditions().size() == 2) {
                super.getAdditions().trimToSize();
            }

            else if(iterator > 2) {
                total -= item.getPrice();
                System.out.println("\nYou can't add another additional item. All of them have been chosen.");
            }
        }
    }

    //Modify addition methods takes two arguments: position in int which describe position in ArrayList we want to change.
    //Second argument is the Items item we want to put in ArrayList at 'position' position.
    @Override
    public void modifyAddition(int position, Items item) {
        position -= 1;
        System.out.println(getClass().getSimpleName() + ": Modifying your " + super.getAdditions().get(position).getItemName() +
                " additional item into...");
        total -= super.getAdditions().get(position).getPrice();

        if (item == Items.CHIPS || item == Items.FRENCH_FRIES || item == Items.TEA
                || item == Items.COFFEE || item == Items.BEER) {
            super.getAdditions().set(position, item);
        }
        else {
            System.out.println("You have to choose among chips, fries or drinks.");
        }

        System.out.println(super.getAdditions().get(position).getItemName() + " at position: " + (position + 1) + ".\nDone!\n");
        total += super.getAdditions().get(position).getPrice();
    }

    //Print all your burger order
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
