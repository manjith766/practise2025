package com.neoteric.interfaceandabstract;

import java.util.Date;

public class Transcation {

    private String transactionId;
    private double amount;
    private String status;
    private Date date;

    public Transcation(String transactionId, double amount, String status, Date date) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }
}
