package com.neoteric.execption;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 10;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());

        }catch (Exception e){
            System.out.println("an error occurred: " + e.getMessage());
        }
    }
}