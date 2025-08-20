package com.neoteric.countmachile;

public class NumberToWords {
    public static void main(String[] args) {
        int n = 1;

        // Convert the number to words
        String word = convertToWords(n);

        // Output the result
        System.out.println("Number in words: " + word);
    }

    public static String convertToWords(int num) {
        // Only handling 1 here as per your request
        switch (num) {
            case 1:
                return "one";
            default:
                return "Number not supported";
        }
    }
}
