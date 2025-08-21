package com.neoteric.interfaceandabstract;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class PhonePay implements PaymentGateway{

    Random random = new Random();
    int id = 100000 + random.nextInt(900000);

    @Override
    public Transcation pay(PaymentInitiationRequest initiationRequest) {
        boolean isSuccess = random.nextBoolean();
        String status = isSuccess ? "SUCCESS" : "FAILED";

        return new Transcation(
                ("avvota"+id),
                initiationRequest.getAmount(),
                status,
                new Date()
        );
    }

}
