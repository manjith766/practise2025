package com.neoteric.insurance;

public class Test {
    public static void main(String[] args) {

         Insurance icicInsurance = new ICICInsurance();
        icicInsurance .ShowPolicyDetails("Health Insurance");
        double premium = icicInsurance.calculatePremium(10000);

        System.out.println("ICIC Insurance Premium: " + premium);



        HDFCInsurance hdfcInsurance = new HDFCInsurance(false);
        hdfcInsurance.ShowPolicyDetails("life Insurance");
        System.out.println("HDFC India Premium: ₹" + hdfcInsurance.calculatePremium(10000));

        System.out.println("  -----------------------------  ");


        HDFCInsurance hdfcForeignInsurance = new HDFCInsurance(true);
        hdfcForeignInsurance.ShowPolicyDetails("Travel Insurance");
        System.out.println("HDFC Foreign Premium: ₹" + hdfcForeignInsurance.calculatePremium(10000));

    }
}
