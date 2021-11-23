package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testMapOperation() {
        // map digunakan untuk mengubah suatu tipe data menjadi tipe data lain
        Stream.of("Hello", "World")
                .map(String::toUpperCase)
                .map(String::length)
                .forEach(System.out::println);
    }

    @Test
    void testFlatMapOperation() {
        // flatmap mengubah suatu tipe data menjadi stream lain
        Stream.of("Hello", "World")
                .map(String::toUpperCase)
                .flatMap(s -> Stream.of(s, s.length()))
                .forEach(System.out::println);
    }
}
