package com.neoteric.foodordering;

public class Menu {
    private String itemName;
    private  double price;

    public Menu(String item, double price){
        this.price = price;
        this.itemName = item;

    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}
