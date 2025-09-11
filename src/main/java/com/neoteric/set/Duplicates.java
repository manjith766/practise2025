package com.neoteric.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("ram","radha","raghu","ram");
        Set<String>set = new HashSet<>(list);
        System.out.println(set);
    }
}
