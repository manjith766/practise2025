package com.neoteric.countmachile;

public class Swapping {
    int a = 10;
    int b = 20;

    public void swap() {
       a = a+b;
       b =a-b;
         a = a-b;
    }
    public static void main(String[] args) {
        System.out.println("Before swapping: a = " + new Swapping().a + ", b = " + new Swapping().b);
        Swapping swapping = new Swapping();
        swapping.swap();
        System.out.println("After swapping: a = " + swapping.a + ", b = " + swapping.b);

    }
}
