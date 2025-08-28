package com.neoteric.bookMyShow;

import java.util.UUID;

 abstract class BookingService implements Payment, Tax {

    public Order createOrder(int numberOfTickets, Double amount) {
        System.out.println("Creating Order...");
        Order order = new Order(UUID.randomUUID().toString(), numberOfTickets, amount);
        System.out.println("Order Created with ID: " + order.getOrderId());
        return order;
    }

    public Ticket confirmBooking(Order order) {
        System.out.println("Booking Confirmed with ID: " + order.getOrderId());
        return new Ticket(order.getOrderId(), "CONFIRMED", new java.util.Date());
    }

    public final Ticket bookTicket(int noOfTickets, double price) {
        double ticketPrice = noOfTickets * price;
        Order order = createOrder(noOfTickets, ticketPrice);
        double tax = calculateTax(ticketPrice);
        double totalAmount = ticketPrice + tax;

        makePayment(order, totalAmount);
        return confirmBooking(order);
    }

}
