package com.neoteric.bankingSystem;

import java.time.LocalDate;

public class BankApplication {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("99999",10000);
        BankAccount PFAccount = new PFAccount("8888",50000, LocalDate.now().minusYears(12));
        BankAccount FDAccount = new FixedDepositAccount("77777",100000,LocalDate.now().plusMonths(3));


        testWithdrawal(savings, 3000);
        testWithdrawal(PFAccount, 40000);
        testWithdrawal(FDAccount, 50000);
    }

    private static void testWithdrawal(BankAccount account, double amount) {
        System.out.println("\nTesting account: " + account.getAccountNumber());
        try{
            account.withdrawl(20000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Failed: " + e.getMessage());
        }
    }
}

