package com.company.mateuszstempak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] main) {

        ArrayList <Items> additions1 = new ArrayList<Items>();
        ArrayList <Items> additions2 = new ArrayList<Items>();
        ArrayList <Items> additions3 = new ArrayList<Items>();

        Burger hamburger = new Hamburger(null, null, additions1);
        Burger deluxeBurger = new DeluxeBurger(null, null, additions2);
        Burger healthyBurger = new HealthyBurger(null, additions3);

        hamburger.setMeat(Items.BEEF_BURGER);
        hamburger.setBread(Items.WHITE_BREAD);
        hamburger.addAddition(Items.TOMATO);
        hamburger.addAddition(Items.BACON);
        hamburger.addAddition(Items.BASIL);
        hamburger.addAddition(Items.PARSLEY_PESTO);
        hamburger.addAddition(Items.KETCHUP);

        deluxeBurger.setMeat(Items.CHICKEN_BURGER);
        deluxeBurger.setBread(Items.DARK_BREAD);
        deluxeBurger.addAddition(Items.COFFEE);
        deluxeBurger.addAddition(Items.CHIPS);

        healthyBurger.setMeat(Items.VEGE_BURGER);
        healthyBurger.addAddition(Items.TOMATO);
        healthyBurger.addAddition(Items.PARSLEY);
        healthyBurger.addAddition(Items.BACON);
        healthyBurger.addAddition(Items.JALAPENO);
        healthyBurger.addAddition(Items.BARBECUE_SAUCE);
        healthyBurger.addAddition(Items.BASIL);
        healthyBurger.modifyAddition(4, Items.PAPRIKA);
        healthyBurger.modifyAddition(6, Items.BASIL_PESTO);

        System.out.println("--\n**$$---FIRST: HAMBURGER BURGER---$$**\n--");
        hamburger.printOrder();

        System.out.println("--\n**$$---SECOND: DELUXE BURGER---$$**\n--");
        deluxeBurger.printOrder();

        System.out.println("--\n&**$$---THIRD: HEALTHY BURGER---$$**\n--");
        healthyBurger.printOrder();
    }
}
