package com.neoteric.interfaceandabstract;

public interface PaymentGateway {

    Transcation pay(PaymentInitiationRequest initiationRequest);
}
