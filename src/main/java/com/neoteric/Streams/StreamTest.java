package com.neoteric.Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamTest {
    public static void main(String[] args) {

        List<Integer> evenNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        evenNumbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(n -> System.out.println(n));


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream s = Arrays.stream(arr);
        s.forEach(n -> System.out.println(n));

        //Stream.iterate(1, n -> n + 1).limit(200000).forEach(System.out::println); // 1,2,3,4,5

        List<Integer>nums = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer>evens =nums.stream()
                .filter(n-> n%2 == 0 )
                .collect(Collectors.toList());
        System.out.println(evens);

        List<String>names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        List<String>upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upper);

        List<List<String>>nestedList = List.of(
                List.of("Alice", "Bob"),
                List.of("Charlie", "David"),
                List.of("Eve")
        );
        List<String>flatList = nestedList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);
        List<String>sorted = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);
        Long c = names.stream()
                .filter(n ->n.length()<3).count();
        System.out.println(c);


    }

}
