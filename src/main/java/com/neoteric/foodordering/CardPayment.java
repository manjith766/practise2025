package com.neoteric.foodordering;

import com.neoteric.booking.insufficientTicketsException;

public class CardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        if (amount<=0)throw new PaymentFailedException("invalid amout");

        System.out.println("paid"+amount+"cardpayment");
    }
}
