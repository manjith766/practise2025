package com.neoteric.ecommerce;

public class PaymentService {

    public  double userBalance = 100000.0;
    public  double merchantBalance = 0.0;


    public void makePayment(Payment payment)throws InsufficientBalanceException{
        double amount = payment.getAmount();

        if(amount>userBalance){
            throw new InsufficientBalanceException("Insufficient balance to make the payment of amount: " + amount);

        }

        userBalance -= amount;
        merchantBalance += amount;


        System.out.println("\n----- Payment Receipt -----");
        System.out.println("Merchant ID: " + payment.getMerchantId());
        System.out.println("Time: " + payment.getTime());
        System.out.println("Customer: " + payment.getOrder().getCustomerName());
        System.out.println("Order ID: " + payment.getOrder().getOrderId());
        System.out.println("Products:");
        for (Product p : payment.getOrder().getProductList()) {
            System.out.println(" - " + p.getProductName() + " : ₹" + p.getPrice());
        }
        System.out.println("Total Amount Paid: ₹" + payment.getAmount());
        System.out.println("Remaining Balance (User): ₹" + userBalance);
        System.out.println("Merchant Balance: ₹" + merchantBalance);
    }

    }

