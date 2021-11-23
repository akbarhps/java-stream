package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.Stream;

public class AggregateOperationTest {

    @Test
    void testMax() {
        Stream.of("Hello", "World")
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        Stream.of("Hello", "World")
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = Stream.of("Hello", "World")
                .count();
        System.out.println(count);
    }

    @Test
    void testSum() {
        var result = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//                .reduce(0, (value, item) -> value + item)
                .reduce(0, Integer::sum);
        System.out.println(result);
    }

    @Test
    void testFactorial() {
        var result = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .reduce(1, (value, item) -> value * item);
        System.out.println(result);
    }
}
