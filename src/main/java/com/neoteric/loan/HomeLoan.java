package com.neoteric.loan;

public class HomeLoan extends Loan  implements Taxable, Payment {

    public HomeLoan(String loanId, double loanAmount, double annualInterestRate, int tenureMonths) {
        super(loanId, loanAmount, annualInterestRate, tenureMonths);
    }

    @Override
    public double calculateEMI() {
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        return (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, tenureMonths)) /
               (Math.pow(1 + monthlyInterestRate, tenureMonths) - 1);
    }

    @Override
    public double calculateTax(double amount) {
        double tax = amount * 0.05; // Assuming a flat 5% tax rate
        System.out.println("Tax on amount " + amount + " is: " + tax);
        return tax;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made towards Home Loan ID: " + loanId);
    }
}
