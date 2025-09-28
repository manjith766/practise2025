package com.neoteric.functionalnterfaces;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer>strLength=s->s.length();

        System.out.println(strLength.apply("Manjith"));
    }
}
