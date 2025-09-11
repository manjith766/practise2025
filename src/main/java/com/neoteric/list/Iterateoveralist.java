package com.neoteric.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterateoveralist {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30);

// 1. For loop (classic)
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

// 2. Enhanced for loop (for-each)
        for(int num : list)
            System.out.println(num);

// 3. Iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());

// 4. ForEach method with lambda (Java 8+)
        list.forEach(System.out::println);

    }
}
