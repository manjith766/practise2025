package com.neoteric.foodordering;

public class PaymentFailedException extends RuntimeException{
    public PaymentFailedException(String message) {
        super("Payment failed: " + message);
    }
}
