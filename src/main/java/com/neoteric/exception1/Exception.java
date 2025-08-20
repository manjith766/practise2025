package com.neoteric.exception1;

public class Exception {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println("The value of c is: " + c);
        }catch (RuntimeException e){
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }

}
