package com.neoteric.loan;

public class Test {
    public static void main(String[] args) {
        Loan loan = new HomeLoan("HL123", 500000.0, 7.5, 240);
        loan.loanSummary();

        double emi = loan.calculateEMI();
        System.out.println("Calculated EMI: " + emi);
        loan.makePayment(emi);
        loan.calculateTax(500000.0);
    }
}
