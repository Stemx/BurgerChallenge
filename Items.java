package com.company.mateuszstempak;

public enum Items {

    BEEF_BURGER(14, "Beef burger"), CHICKEN_BURGER(12, "Chicken burger"), FISH_BURGER(11, "Fish burger"),
    VEGE_BURGER(9, "Vege burger"), WHITE_BREAD(2, "White bread"), DARK_BREAD(3, "Dark bread"), BROWN_RYE_BREAD(4, "Brown rye bread"),
    TOMATO(1, "Tomato"), PICKLE(1, "Pickle"), ONION(1, "Onion"), LETTUCE(1, "Lettuce"), PAPRIKA(1, "Paprika"), KETCHUP(1, "Ketchup"),
    MUSTARD(1, "Mustard"), BARBECUE_SAUCE(2, "Barbecue sauce"), PARSLEY(1, "Parsley"), PARSLEY_PESTO(2, "Parsley pesto"),
    JALAPENO(2, "Jalapeno"), BASIL(2, "Basil"), BASIL_PESTO(2, "Basil pesto"), BACON(2, "Bacon"), TEA(5, "Tea"), COFFEE(8, "Coffee"),
    BEER(9, "Beer"), CHIPS(5, "Chips"), FRENCH_FRIES(8, "French fries");

    private final int price;
    private final String itemName;

    Items(int price, String itemName) {

        this.price = price;
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

//    public String getStringItem(Items items) {
//
//        switch(items) {
//            case BEEF_BURGER:
//                return "Beef burger";
//            case CHICKEN_BURGER:
//                return "Chicken burger";
//            case FISH_BURGER:
//                return "Fish burger";
//            case VEGE_BURGER:
//                return "Vege burger";
//            case WHITE_BREAD:
//                return "White bread";
//            case DARK_BREAD:
//                return "Dark bread";
//            case BROWN_RYE_BREAD:
//                return "Brown rye bread";
//            case TOMATO:
//                return "Tomato";
//            case PICKLE:
//                return "Pickle";
//            case ONION:
//                return "Onion";
//            case LETTUCE:
//                return "Lettuce";
//            case PAPRIKA:
//                return "Paprika";
//            case KETCHUP:
//                return "Ketchup";
//            case MUSTARD:
//                return "Mustard";
//            case BARBECUE_SAUCE:
//                return "Barbecue sauce";
//            case PARSLEY:
//                return "Parsley";
//            case PARSLEY_PESTO:
//                return "Parsley pesto";
//            case JALAPENO:
//                return "Jalapeno";
//            case BASIL:
//                return "Basil";
//            case BASIL_PESTO:
//                return "Basil pesto";
//            case BACON:
//                return "Bacon";
//            case TEA:
//                return "Tea";
//            case COFFEE:
//                return "Coffee";
//            case BEER:
//                return "Beer";
//        }
//
//        return null;
//    }


}
