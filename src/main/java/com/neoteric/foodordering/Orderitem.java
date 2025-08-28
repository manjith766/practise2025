package com.neoteric.foodordering;

public class Orderitem {
    private  Menu menuitem;
    private int quantity;

    public Orderitem(Menu menuitem, int quantity) {
        this.menuitem = menuitem;
        this.quantity = quantity;
    }

    public double getCost() {
        return menuitem.getPrice() * quantity;
    }
    public String getItemName() {
        return menuitem.getItemName();
    }

    public  int getQuantity(){
        return quantity;
    }

    public Menu getMenuitem() {
        return menuitem;
    }
}
