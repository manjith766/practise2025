package com.neoteric.interfaceandabstract;

public class PaymentInitiationRequest {

    private String bookingId;
    private double amount;
    private String merchantId;

    public PaymentInitiationRequest(String bookingId, double amount, String merchantId) {
        this.bookingId = bookingId;
        this.amount = amount;
        this.merchantId = merchantId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public double getAmount() {
        return amount;
    }

    public String getMerchantId() {
        return merchantId;
    }
}
