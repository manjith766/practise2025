package com.neoteric.ecommerce;

import java.time.LocalDateTime;

public class Payment {
    private String merchantId;
    private LocalDateTime time;
    private Order order;
    private double amount;

    public Payment(String merchantId, LocalDateTime time, Order order, double amount) {
        this.merchantId = merchantId;
        this.time = time;
        this.order = order;
        this.amount = amount;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Order getOrder() {
        return order;
    }

    public double getAmount() {
        return amount;
    }
}
