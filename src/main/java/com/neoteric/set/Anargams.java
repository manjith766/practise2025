package com.neoteric.set;

import java.util.HashSet;
import java.util.Set;

public class Anargams {

    public static void main(String[] args) {

        String s1 ="listen";
        String s2 = "silent";

        Set<Character>set1 = new HashSet<>();
        for (char c : s1.toCharArray())set1.add(c);

        Set<Character>set2 = new HashSet<>();
        for (char c :s2.toCharArray())set2.add(c);


        if (set1.equals(set2)) {
            System.out.println(s1  +  " and "  +  s2 +  " are anargams");
        }
        else {
            System.out.println( s1+ "and"+s2+ " not argams");
        }

    }
}
