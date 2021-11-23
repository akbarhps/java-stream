package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.Stream;

public class OrderingOperationTest {

    @Test
    void testSorted() {
        Stream.of("Hello", "World")
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Stream.of("Hello", "World")
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
