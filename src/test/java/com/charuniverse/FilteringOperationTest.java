package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {

    @Test
    void testFilteringOperation() {
        List<String> greetings = List.of("Hello", "Wor", "Hello", "World");

        greetings.stream()
                .filter(s -> s.length() > 3)
                .forEach(System.out::println);

        greetings.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
