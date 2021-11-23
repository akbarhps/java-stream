package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class RetrievingOperationTest {
    @Test
    void testLimit() {
        Stream.of("Hello", "World")
                .limit(1)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        Stream.of("yo", "Hello", "World", "ddd")
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        // takeWhile hanya mengambil data selama memenuhi kondisi
        // ketika kondisi false, maka takeWhile akan break
        Stream.of("yo", "Hello", "World", "ddd")
                .takeWhile(s -> s.length() < 5)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        // dropWhile menghapus data selama kondisi terpenuhi
        // ketikda kondisi false, maka dropWhile tidak akan menghapus data
        // (skip check)
        Stream.of("yo", "Hello", "World", "ddd")
                .dropWhile(s -> s.length() < 5)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        // mengambil 1 data random dari stream (kata dokumentasinya)
        // mengambalikan Optional<T>
        // merupakan terminal operation (mentrigger stream)
        Optional<String> any = Stream
                .of("Hello", "World", "ddd")
                .findAny();
        any.ifPresent(System.out::println);
    }

    @Test
    void testFindFirst() {
        // mengambil 1 data pertama
        // mengambalikan Optional<T>
        // merupakan terminal operation (mentrigger stream)
        Optional<String> any = Stream
                .of("Hello", "World", "ddd")
                .findFirst();
        any.ifPresent(System.out::println);
    }
}
