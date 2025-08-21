package com.neoteric.interfaceandabstract;

public class Test {
    public static void main(String[] args) {

        PhonePay phonePay = new PhonePay();
        PaymentInitiationRequest paymentInitiationRequest = new PaymentInitiationRequest("B001", 5000, "M001");
        PaymentInitiationRequest paymentInitiationRequest1 = new PaymentInitiationRequest("B002", 15000, "M002");
        Transcation transcation = phonePay.pay(paymentInitiationRequest);
        System.out.println("PhonePay Transaction ID: " + transcation.getTransactionId());
        System.out.println("PhonePay Amount: " + transcation.getAmount());
        System.out.println("PhonePay Status: " + transcation.getStatus());
        System.out.println("PhonePay Date: " + transcation.getDate());

        if ("SUCCESS".equals(transcation.getStatus())) {
            System.out.println("PhonePay Payment Successful");
        } else {
            System.out.println("PhonePay Payment Failed");
        }
    }
}
