package com.neoteric.Streams;

import java.util.*;
import java.util.stream.IntStream;

public class StreamVsParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed( 1000000,1).boxed().toList();


        long start1 = System.currentTimeMillis();
        long count1 = numbers.stream()
                .filter(n -> n % 2 == 0)  // check even numbers
                .count();
        long end1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count = " + count1 + " | Time = " + (end1 - start1) + " ms");


        long start2 = System.currentTimeMillis();
        long count2 = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .count();
        long end2 = System.currentTimeMillis();
        System.out.println("Parallel Stream Count   = " + count2 + " | Time = " + (end2 - start2) + " ms");
    }
}
