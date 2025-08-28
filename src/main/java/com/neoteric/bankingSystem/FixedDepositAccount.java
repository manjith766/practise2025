package com.neoteric.bankingSystem;

import java.time.LocalDate;

public class FixedDepositAccount extends BankAccount{

    private LocalDate maturityDate;
    public FixedDepositAccount(String accountNumber, double balance,LocalDate maturityDate) {
        super(accountNumber, balance);
        this.maturityDate =maturityDate;
    }

    @Override
    public void withdrawl(double amount) throws InsufficientBalanceException {
    LocalDate now =LocalDate.now();

        if (now.isBefore(maturityDate)){
           double maxWithdrawable = balance*0.75;
    if (amount > maxWithdrawable ){
        throw  new InsufficientBalanceException("cannot withdrawl more than 75% of fd meturity");
    }
    balance -=amount;
    System.out.println("withdrawn"+amount+"from fd before maturity .remaining balance"+balance);

        }else {
            if (amount>balance){
                throw new InsufficientBalanceException("Insufficient funds in fd account");
            }balance -= amount;
            System.out.println("withdrawn"+amount+"from fd after the maturity .remaining balance");
        }

    }
}
