package com.neoteric.bookMyShow;

import java.util.UUID;

public class BookMyShowService extends BookingService {

    @Override
    public void makePayment(Order order, double amount) {
        System.out.println("💳 Payment of Rs." + amount + " received for Order ID: " + order.getOrderId());

    }
    @Override
    public double calculateTax(double price) {
        double tax = price * 0.18;
        System.out.println("Tax Calculated: " + tax);
        return tax;
    }
}
