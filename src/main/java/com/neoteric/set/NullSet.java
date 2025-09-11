package com.neoteric.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class NullSet {
    public static void main(String[] args) {


        Set<String> set = new LinkedHashSet<>();
        set.add(null);
        set.add(null);

        System.out.println(set);

    }
}
