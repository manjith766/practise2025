package com.neoteric.foodordering;

public class RestaurantNotFoundException extends RuntimeException{
    public RestaurantNotFoundException(String name) {
        super("Restaurant '" + name + "' not found!");
    }
}
