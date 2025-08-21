package com.neoteric.ecommerce;

import java.util.List;

public class Order {
    private String orderId;
    private String customerName;
    List<Product>productList;
    private double price;


    public Order(String orderId, String customerName, List<Product> productList, double price) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productList = productList;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public double getPrice() {
        return price;
    }
}
