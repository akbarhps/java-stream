package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class LazyEvaluationTest {

    @Test
    void testIntermediateOperation() {
        // stream tidak akan di trigger sampai dilakukan terminal operation
        Stream.of("Hello", "World")
                .map(greet -> {
                    System.out.println("map: " + greet);
                    return greet.toUpperCase();
                });
    }

    @Test
    void testTerminalOperation() {
        Stream.of("Hello", "World")
                .map(greet -> {
                    System.out.println("map: " + greet);
                    return greet.toUpperCase();
                }).forEach(System.out::println);
    }
}
