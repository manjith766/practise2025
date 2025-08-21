package com.neoteric.insurance;

public interface Insurance {

    void ShowPolicyDetails(String policyType);
    double calculatePremium(double baseAmount);

}
