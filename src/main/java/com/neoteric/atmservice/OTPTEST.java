package com.neoteric.atmservice;

public class OTPTEST {
    public static void main(String[] args) {
        otpservice otpService = new otpservice();
        String userId = "user123";

        // Generate OTP
        Otp generatedOtp = otpService.generateOtp(userId);
        System.out.println("Generated OTP: " + generatedOtp.getOtp());

        try {
            // Validate OTP
            boolean isValid = otpService.validateOtp(userId, generatedOtp);
            System.out.println("Is OTP valid? " + isValid);
        } catch (Invalidotpexception e) {
            System.err.println("OTP validation failed: " + e.getMessage());
        }
    }
}
