package com.neoteric.bankingSystem;

public interface BankAccountOperations {
    void withdrawl(double amount) throws InsufficientBalanceException;

}
