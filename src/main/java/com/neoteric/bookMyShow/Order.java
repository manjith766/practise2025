package com.neoteric.bookMyShow;

public class Order {

    private String orderId;
    private int numberOfTickets;
    private Double amount;

    public Order(String orderId, int numberOfTickets, Double amount) {
        this.orderId = orderId;
        this.numberOfTickets = numberOfTickets;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public Double getAmount() {
        return amount;
    }

}
