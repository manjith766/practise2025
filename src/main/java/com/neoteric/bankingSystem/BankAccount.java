package com.neoteric.bankingSystem;

public  abstract class BankAccount implements BankAccountOperations{
   protected String accountNumber;
   protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
