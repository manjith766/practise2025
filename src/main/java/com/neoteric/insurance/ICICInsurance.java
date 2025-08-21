package com.neoteric.insurance;

public class ICICInsurance implements Insurance{
    public static final double discount = 0.04;

    @Override
    public void ShowPolicyDetails(String policyType) {
        System.out.println("ICIC Insurance Policy  " + policyType);

    }

    @Override
    public double calculatePremium(double baseAmount) {
        double gstamount = baseAmount * TaxConfig.India_gst;
        double totalAmount = baseAmount + gstamount;
        double discountAmount = totalAmount * discount;
        return totalAmount - discountAmount;
    }
}
