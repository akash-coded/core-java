package src.functional_programming.stream_api;

import java.util.*;
import java.util.stream.*;

class StreamDemo {
    public static void main(String[] args) {
        // create an array of Integers
        Integer[] arr = { 1, 2, 3 };

        // creating an Integer Stream of the array elements
        Stream<Integer> numstream = Stream.of(arr);
        numstream.forEach(System.out::println);

        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x * x).toList();
        System.out.println(square);

        // create a list of String
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).toList();
        System.out.println(result);

        // demonstration of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        // collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

        // demonstration of method reference
        number.stream().map(x -> x * x * x).forEach(System.out::println);

        // demonstration of reduce method
        int evenSum = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(evenSum);
    }
}
