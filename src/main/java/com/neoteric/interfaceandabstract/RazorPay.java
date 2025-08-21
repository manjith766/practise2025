package com.neoteric.interfaceandabstract;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class RazorPay implements PaymentGateway{
    Random random = new Random();
    int id = 100000 + random.nextInt(900000); // 6-digit random number

    @Override
    public Transcation pay(PaymentInitiationRequest initiationRequest) {
       boolean isSuccess = random.nextBoolean();
         String status = isSuccess ? "SUCCESS" : "FAILED";

        return new Transcation(
                ("rzp"+id),
                initiationRequest.getAmount(),
                status,
                new Date()
        );

    }
}
