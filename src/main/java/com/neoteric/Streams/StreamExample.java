package com.neoteric.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<String>names = Arrays.asList("ram","teju","bhargavi","arun");

        List<String>result = names.stream()
                .filter(name->name.length()>3)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);

        List<String>result1= names.parallelStream()
                .filter(name->name.length()>3)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);



    }
}
