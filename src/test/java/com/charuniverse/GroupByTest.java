package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByTest {

    @Test
    void testGroupingBy() {
        Map<String, List<Integer>> group = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(num -> num > 5 ? "Besar" : "Kecil"));

        System.out.println(group);
    }

    @Test
    void testGroupingBy2() {
        Map<String, List<String>> group = Stream.of("Hello", "Worldd")
                .collect(Collectors.groupingBy(str -> str.length() > 5 ? "Panjang" : "Pendek"));

        System.out.println(group);
    }

    @Test
    void testPartitioningBy() {
        Map<Boolean, List<String>> group = Stream.of("Hello", "Worldd")
                .collect(Collectors.partitioningBy(s -> s.length() > 5));

        System.out.println(group);
    }
}
