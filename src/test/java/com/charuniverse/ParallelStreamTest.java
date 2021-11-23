package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ParallelStreamTest {

    @Test
    void testSequentialStream() {
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .forEach(n -> {
                    System.out.println(Thread.currentThread().getName() + " : " + n);
                });
    }

    @Test
    void testParallelStream() {
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .parallel()
                .forEach(n -> {
                    System.out.println(Thread.currentThread().getName() + " : " + n);
                });
    }
}
