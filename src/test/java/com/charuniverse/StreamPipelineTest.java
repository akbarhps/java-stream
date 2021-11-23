package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateStream() {
        // Cara yang jarang digunakan
        Stream<String> hell = Stream.of("hello", "world");
        Stream<String> upperHell = hell.map(String::toUpperCase);
        Stream<String> prefixHell = upperHell.map(s -> "yoooooo " + s);
        prefixHell.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipeline() {
        // stream pipeline
        Stream.of("Hello", "World")
                .map(String::toUpperCase)
                .map(v -> "yoooooo " + v)
                .forEach(System.out::println);
    }
}
