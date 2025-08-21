package com.neoteric.atmservice;

import java.util.Objects;

public class Otp {

    private Integer otp;
    private long expiryTime; // in milliseconds

    public Otp(Integer otp, long expiryTime) {
        this.otp = otp;
        this.expiryTime = expiryTime;
    }

    public Integer getOtp() {
        return otp;
    }

    public long getExpiryTime() {
        return expiryTime;
    }
}
