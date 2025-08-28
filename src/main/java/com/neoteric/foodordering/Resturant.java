package com.neoteric.foodordering;

public class Resturant extends AbstractRestaurant {
    public Resturant(String name) {
        super(name);
    }

    @Override
    public void showMenu() {
        System.out.println("Menu of " + name + ":");
        for (Menu item : menu) {
            System.out.println(" - " + item.getItemName() + " : ₹" + item.getPrice());
        }
    }

}
