package com.neoteric.execption;

class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}

public class Example5 {
    public static void main(String[] args) {
        try {
            int age = 20;  // change this to test different ages
            if (age < 18) {
                throw new AgeException("Age must be 18+ to vote.");
            } else {
                System.out.println("✅ Eligible for vote!");
            }
        } catch (AgeException e) {
            System.out.println("" + e.getMessage());
        }
    }
}
