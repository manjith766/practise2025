package com.neoteric.execption;

public class BankDemo {
    private static double balance;
    static void withdraw(double amount) throws Insufficientfunds{
        if(amount> balance){
            throw new Insufficientfunds("Insufficient funds for withdrawal of " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }

    }

    public static void main(String[] args) {
        BankDemo bankDemo = new BankDemo();
        bankDemo.balance = 10000; // Initial balance

        try {
            withdraw(5000);
        }catch (Insufficientfunds e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("transaction complete. Current balance: " + balance);
    }
}
