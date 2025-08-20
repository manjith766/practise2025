package com.neoteric.countmachile;

public class Counttest {
    public static void main(String[] args) {
        CountmachineService countmachineService= new CountmachineService();
        int numberOfNotes = 10;
        int denomination = 100;
        int totalAmount = countmachineService.count(numberOfNotes, denomination);
        System.out.println("Total amount for " + numberOfNotes + " notes of denomination "
                + denomination + " is: " + totalAmount);
        }
    }

