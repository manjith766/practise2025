package com.neoteric.functionalnterfaces;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer>iseven= n->n%2==0;

        System.out.println(iseven.test(20));
        System.out.println(iseven.test(3));

    }
}
