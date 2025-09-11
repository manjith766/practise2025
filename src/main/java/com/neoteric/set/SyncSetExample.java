package com.neoteric.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SyncSetExample {
    public static void main(String[] args) {
        Set<String>set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String>syncset = Collections.synchronizedSet(set);
        for (String s : syncset) {
            System.out.println(s);
        }

    }
}
