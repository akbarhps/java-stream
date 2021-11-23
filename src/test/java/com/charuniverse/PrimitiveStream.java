package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStream {

    @Test
    void testCreatePrimitiveStream() {
        IntStream.range(1, 10)
                .forEach(System.out::println);

        LongStream.range(1, 10)
                .forEach(System.out::println);

        DoubleStream.of(0.1, 0.2)
                .forEach(System.out::println);
    }

    @Test
    void testPrimitiveOperation() {
        IntStream.range(1, 10)
                .forEach(System.out::println);

        OptionalDouble avg = IntStream.range(1, 100)
                .average();
        avg.ifPresent(System.out::println);

        IntStream.range(0, 100)
                .mapToObj(n -> "number: " + n)
                .forEach(System.out::println);
    }
}
