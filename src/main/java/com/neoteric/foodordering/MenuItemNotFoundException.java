package com.neoteric.foodordering;

public class MenuItemNotFoundException extends RuntimeException{

    public MenuItemNotFoundException(String itemName) {
    super("Menu item '" + itemName + "' not found in restaurant!");
}
}
