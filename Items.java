package com.company.mateuszstempak;

public enum Items {

    //All of burger items

    BEEF_BURGER(14, "Beef burger"), CHICKEN_BURGER(12, "Chicken burger"), FISH_BURGER(11, "Fish burger"),
    VEGE_BURGER(9, "Vege burger"), WHITE_BREAD(2, "White bread"), DARK_BREAD(3, "Dark bread"), BROWN_RYE_BREAD(4, "Brown rye bread"),
    TOMATO(1, "Tomato"), PICKLE(1, "Pickle"), ONION(1, "Onion"), LETTUCE(1, "Lettuce"), PAPRIKA(1, "Paprika"), KETCHUP(1, "Ketchup"),
    MUSTARD(1, "Mustard"), BARBECUE_SAUCE(2, "Barbecue sauce"), PARSLEY(1, "Parsley"), PARSLEY_PESTO(2, "Parsley pesto"),
    JALAPENO(2, "Jalapeno"), BASIL(2, "Basil"), BASIL_PESTO(2, "Basil pesto"), BACON(2, "Bacon"), TEA(5, "Tea"), COFFEE(8, "Coffee"),
    BEER(9, "Beer"), CHIPS(5, "Chips"), FRENCH_FRIES(8, "French fries");

    //private fields for price and name
    private final int price;
    private final String itemName;

    //Enum constructor
    Items(int price, String itemName) {

        this.price = price;
        this.itemName = itemName;
    }

    //Method which returns item's name
    public String getItemName() {
        return itemName;
    }

    //Method which returns items's price
    public int getPrice() {
        return price;
    }


}
