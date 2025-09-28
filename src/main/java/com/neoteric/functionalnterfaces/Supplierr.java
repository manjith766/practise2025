package com.neoteric.functionalnterfaces;

import java.util.function.Supplier;

public class Supplierr {

    public static void main(String[] args) {
        Supplier<Long>currenttime=()->System.currentTimeMillis();

        System.out.println(currenttime.get());
    }
}
