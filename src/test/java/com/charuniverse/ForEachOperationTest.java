package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ForEachOperationTest {

    @Test
    void testPeek() {
        // peek merupakan intermediate operator
        // peek tidak akan men trigger stream
        Stream.of("Hello", "World")
                .map(String::toUpperCase)
                .peek(u -> System.out.println("check upper: " + u))
                .forEach(System.out::println);
    }
}
