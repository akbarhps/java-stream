package com.charuniverse;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

    @Test
    void testCollectorsCollection() {
        List<String> greetings = List.of("Hello", "World");

//        Set<String> set = new HashSet<>(greetings);
        Set<String> set = greetings.stream()
                .collect(Collectors.toSet());

        Set<String> immutableSet = greetings.stream()
                .collect(Collectors.toUnmodifiableSet());

        List<String> list = Stream.of("Hello", "World")
                .collect(Collectors.toList());

        List<String> immutableList = Stream.of("Hello", "World")
//                .toList()
                .collect(Collectors.toUnmodifiableList());
    }

    @Test
    void testMap() {
        Map<String, Integer> map = Stream.of("Hello", "World")
                .collect(Collectors.toMap(
                        item -> item, //setting map keys
                        item -> item.length() //setting map values
                ));
        System.out.println(map);
    }
}
