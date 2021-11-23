# Java Stream


## Membuat Stream
---

```java
Stream<String> single = Stream.of("Hello world");
Stream<String> empty = Stream.empty();
// error
// Stream<String> nullStream = Stream.of(null);
// stream of hanya bisa digunakan non null
Stream<String> nullStream = Stream.ofNullable(null);
```


### Stream dari Array

```java
Stream<String> streamString = Stream.of("Hello", "world");
Stream<String> streamFromArrayExplicit = Stream.of(new String[]{"Hello", "world"});

String[] array = new String[]{
        "Hello", "World"
};
Stream<String> streamFromArrayVar = Arrays.stream(array);
```


### Stream dari Collection

```java
Collection<String> collection = List.of("Hello", "World");
Stream<String> streamString = collection.stream();
streamString.forEach(System.out::println);
```


### Stream Infinite

```java
Stream<String> generate = Stream.generate(() -> "Hello");
// inf.forEach(System.out::println);

Stream<Integer> iterate = Stream.iterate(0, i -> i + 1);
// iterate.forEach(System.out::println);
iterate.limit(10).forEach(System.out::println);
```


### Mengakses Stream

```java
Stream<String> streamString = Stream.of("Hello", "world");
streamString.forEach(System.out::println);
```


### Error mengakses Stream lebih dari 1 kali

```java
Collection<String> collection = List.of("Hello", "World");
Stream<String> streamString = collection.stream();
streamString.forEach(System.out::println);
// streamString.forEach(System.out::println);
// java.lang.IllegalStateException: stream has already been operated upon or closed
```

