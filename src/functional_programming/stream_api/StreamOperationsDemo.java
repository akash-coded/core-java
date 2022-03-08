package src.functional_programming.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperationsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 3);
        System.out.println(numbers);
        List<Integer> squares = numbers.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println(squares);
        Set<Integer> squaresSet = numbers.stream().map(num -> num * num).collect(Collectors.toSet());
        System.out.println(squaresSet);

        List<String> names = Arrays.asList("Akash", "John", "Ariel");
        System.out.println(names);
        List<String> namesStartingWithA = names.stream().filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(namesStartingWithA);

        List<String> namesSortedAlphabetically = names.stream().sorted().collect(Collectors.toList());
        System.out.println(namesSortedAlphabetically);

        int sumOfEven = numbers.stream().filter(num -> num % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println("Sum of even numbers = " + sumOfEven);
    }
}
