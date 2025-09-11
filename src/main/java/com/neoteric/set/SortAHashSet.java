package com.neoteric.set;

import java.util.*;
import java.util.HashSet;

public class SortAHashSet {
    public static void main(String[] args) {
        Set<Integer>set = new HashSet<>();

        set.add(20);
        set.add(30);
        set.add(40);

        Set<Integer>set1 = new TreeSet<>(set);


        //List<Integer>list= new ArrayList<>(set);
       // Collections.sort(list);
        System.out.println(set1);
    }
}
