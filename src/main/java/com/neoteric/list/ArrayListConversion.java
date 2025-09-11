package com.neoteric.list;

import java.util.Arrays;
import java.util.List;

public class ArrayListConversion {
    public static void main(String[] args) {

        String [] arr ={"A","B","C"};

        List<String>list = Arrays.asList(arr);


        String [] newarr = list.toArray(new String[0]);

        System.out.println(list);
    System.out.println(Arrays.toString(newarr));
    }
}
