package com.neoteric.emi;

public class Loan {
    private Double principalamount;
    private Double anualinterest;
    private int years;

    public Loan(Double principalamount, Double anualinterest, int years) {
        this.principalamount = principalamount;
        this.anualinterest = anualinterest;
        this.years = years;
    }

    public Double getPrincipalamount() {
        return principalamount;
    }

    public Double getAnualinterest() {
        return anualinterest;
    }

    public int getYears() {
        return years;
    }
}
