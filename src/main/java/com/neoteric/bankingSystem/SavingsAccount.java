package com.neoteric.bankingSystem;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdrawl(double amount)throws InsufficientBalanceException {
        if(amount > balance){
            throw new InsufficientBalanceException("insufficient balance in savings account");
        }
        balance -= amount;
        System.out.println("withdrawn"+amount+"from savings account.remaining balance "+balance);

    }
}
