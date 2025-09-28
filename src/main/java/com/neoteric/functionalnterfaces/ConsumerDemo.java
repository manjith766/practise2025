package com.neoteric.functionalnterfaces;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String>print = s->System.out.println("hello"+s);
        print.accept("manjith");
    }
}
