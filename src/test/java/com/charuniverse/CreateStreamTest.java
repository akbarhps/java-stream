package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingle() {
        Stream<String> single = Stream.of("Hello world");
        Stream<String> empty = Stream.empty();
        // error
        // Stream<String> nullStream = Stream.of(null);
        // stream of hanya bisa digunakan non null
        Stream<String> nullStream = Stream.ofNullable(null);
    }

    @Test
    void testCreateFromArray() {
        Stream<String> streamString = Stream.of("Hello", "world");
        streamString.forEach(System.out::println);

        Stream<String> streamFromArrayExplicit = Stream.of(new String[]{"Hello", "world"});

        String[] array = new String[]{
                "Hello", "World"
        };
        Stream<String> streamFromArrayVar = Arrays.stream(array);
    }

    @Test
    void testCreateFromCollection() {
        Collection<String> collection = List.of("Hello", "World");
        Stream<String> streamString = collection.stream();
        streamString.forEach(System.out::println);
        // streamString.forEach(System.out::println);
        // java.lang.IllegalStateException: stream has already been operated upon or closed
    }

    @Test
    void testCreateInfinite() {
        Stream<String> generate = Stream.generate(() -> "Hello");
//        inf.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(0, i -> i + 1);
//        iterate.forEach(System.out::println);
        iterate.limit(10).forEach(System.out::println);
    }
}
