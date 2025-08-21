package com.neoteric.atmservice;

import java.util.Random;

public class otpservice {

    private Otp currentOtp; // store the last generated OTP for validation

    // Generate OTP
    public Otp generateOtp(String userId) {
        Random random = new Random();
        int otpValue = 100000 + random.nextInt(900000); // 6-digit OTP
        long expiryTime = System.currentTimeMillis() + 300000; // valid for 5 minutes

        this.currentOtp = new Otp(otpValue, expiryTime); // save OTP
        return currentOtp;
    }

    // Validate OTP
    public boolean validateOtp(String userId, Otp otp) throws Invalidotpexception {
        if (otp == null) {
            throw new Invalidotpexception("OTP cannot be null");
        }

        if (otp.getExpiryTime() < System.currentTimeMillis()) {
            throw new Invalidotpexception("OTP has expired");
        }

        if (this.currentOtp != null && this.currentOtp.equals(otp)) {
            return true;
        } else {
            throw new Invalidotpexception("OTP is invalid");
        }
    }
}
