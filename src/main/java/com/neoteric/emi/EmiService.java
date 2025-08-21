package com.neoteric.emi;

public class EmiService {

    public double calculateEmi(Loan loan) {
        double principal = loan.getPrincipalamount();
        double monthlyInterestRate = loan.getAnualinterest() / 12 / 100;
        int numberOfMonths = loan.getYears() * 12;

        return (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

    }
    // Print loan summary
    public void printSummary(Loan loan) {
        double emi = calculateEmi(loan);
        int months = loan.getYears() * 12;
        double totalPayment = emi * months;
        double totalInterest = totalPayment - loan.getPrincipalamount();

        System.out.println("------ Loan Summary ------");
        System.out.printf("Loan Amount       : %.2f\n", loan.getPrincipalamount());
        System.out.printf("Annual Interest   : %.2f%%\n", loan.getAnualinterest());
        System.out.printf("Tenure            : %d years (%d months)\n", loan.getYears(), months);
        System.out.printf("Monthly EMI       : %.2f\n", emi);
        System.out.printf("Total Payment     : %.2f\n", totalPayment);
        System.out.printf("Total Interest    : %.2f\n", totalInterest);
        System.out.println("--------------------------");
    }


}
