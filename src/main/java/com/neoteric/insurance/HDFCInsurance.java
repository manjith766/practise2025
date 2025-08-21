package com.neoteric.insurance;

public class HDFCInsurance implements Insurance{

    public  static final double discount = 0.05;
    private  boolean isForeignpolocy;

    public HDFCInsurance(boolean isForeignpolocy) {
        this.isForeignpolocy = isForeignpolocy;
    }


    @Override
    public void ShowPolicyDetails(String policyType) {
        String region = isForeignpolocy ? "International" : "Domestic";
        System.out.println("HDFC Insurance (" + region + ") - Policy: " + policyType);

    }

    @Override
    public double calculatePremium(double baseAmount) {
        double gstRate = isForeignpolocy ? TaxConfig.Foreign_gst : TaxConfig.India_gst;
        double gstamount = baseAmount* gstRate;
        double totalAmount = baseAmount + gstamount;
        double discountAmount = totalAmount * discount;
        return totalAmount - discountAmount;


    }
}
