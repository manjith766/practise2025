package com.neoteric.foodordering;

public class UpiPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        if(amount <= 0)throw new PaymentFailedException("invalid amount");
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}
