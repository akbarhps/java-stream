package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CheckOperationTest {

    @Test
    void testAnyMatch() {
        boolean match = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .anyMatch(i -> i > 5);
        System.out.println(match);
    }

    @Test
    void testAllMatch() {
        boolean match = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .allMatch(i -> i > 5);
        System.out.println(match);
    }

    @Test
    void testNoneMatch() {
        boolean match = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .noneMatch(i -> i > 5);
        System.out.println(match);
    }
}
