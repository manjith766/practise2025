package com.neoteric.execption;

public class exception {

    public static void main(String[] args) {
        System.out.println("hello1");
        System.out.println("hello2");

        try{
            int i =  0;
            int j = 10/i;
        }catch (Exception e){
            System.out.println("exception caught: " + e.getMessage());
        }
        System.out.println("hello3");
        System.out.println("hello4");
        System.out.println("hello5");
    }
}
