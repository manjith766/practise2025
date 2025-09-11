package com.neoteric.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>(Arrays.asList(20, 30, 40));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(40, 50, 60));

        Set<Integer> union = new HashSet<>(set);
        union.addAll(set1);

        System.out.println("union"+union);


        Set<Integer>intersection = new HashSet<>(set);
        intersection.retainAll(set1);

        System.out.println("intersection"+intersection);

    }
}
