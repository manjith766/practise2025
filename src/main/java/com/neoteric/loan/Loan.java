package com.neoteric.loan;

abstract class Loan implements Payment, Taxable {
    protected String loanId;
    protected double loanAmount;
    protected double annualInterestRate;
    protected int tenureMonths;

    public Loan(String loanId, double loanAmount, double annualInterestRate, int tenureMonths) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.tenureMonths = tenureMonths;
    }

    public abstract  double calculateEMI();

    public void loanSummary() {
        System.out.println("Loan ID: " + loanId);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Annual Interest Rate: " + annualInterestRate);
        System.out.println("Tenure (Months): " + tenureMonths);
    }

}
