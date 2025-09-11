package com.neoteric.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedhashSetDemo {

    public static void main(String[] args) {
        Set<String>set = new TreeSet<>();
        set.add("banana");
        set.add("apple");
        set.add("orange");

        System.out.println(set);
    }
}
