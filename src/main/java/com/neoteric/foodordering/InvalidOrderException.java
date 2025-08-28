package com.neoteric.foodordering;

public class InvalidOrderException extends RuntimeException{
    public InvalidOrderException(String message) {
        super("Invalid Order: " + message);
    }
}
