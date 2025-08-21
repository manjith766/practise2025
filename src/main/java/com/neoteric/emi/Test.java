package com.neoteric.emi;

public class Test {

    public static void main(String[] args) {
         Loan loan = new Loan(500000.0, 7.5, 20);

            EmiService emiService = new EmiService();
            emiService.printSummary(loan);
    }
}
