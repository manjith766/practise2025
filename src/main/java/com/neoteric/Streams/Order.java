package com.neoteric.Streams;

public class Order {

    String id;

    String status;

    public Order(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
