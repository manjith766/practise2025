package com.neoteric.set;

import java.util.Set;

public class HashSet {

    public static void main(String[] args) {
        Set<String> set= new java.util.HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");

        System.out.println(set);
    }
}
