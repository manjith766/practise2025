package com.neoteric.list;

import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(20,20,30,40,30);
        Collections.reverse(list);

        //List<Integer>unique = new ArrayList<>(new HashSet<>(list));


        System.out.println(list);
    }
}
