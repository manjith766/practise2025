package com.neoteric.bankingSystem;

import java.time.LocalDate;
import java.time.Period;

public class PFAccount extends BankAccount{
   private LocalDate accountStartDate;
    public PFAccount(String accountNumber, double balance, LocalDate accountStartDate) {
        super(accountNumber, balance);
        this.accountStartDate = accountStartDate;
    }

    @Override
    public void withdrawl(double amount) throws InsufficientBalanceException {

        LocalDate now = LocalDate.now();
        int years = Period.between(accountStartDate,now).getYears();
        double maxWithdrawable;

        if (years < 10){
            throw new InsufficientBalanceException("cannot withdrawl amount before 10 years");
            
        } else if (years < 15) {
            maxWithdrawable = balance*0.7;
            
        }else {
            maxWithdrawable = balance;
        }

        if (amount > maxWithdrawable){
            throw new InsufficientBalanceException("cannot withdrawl more than allowed limit from pf account");

        }

        balance -= amount;
        System.out.println("withdrawl"+amount+"from pf account.remaining balance"+balance);


    }
}
