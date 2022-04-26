package src.functional_programming.method_references;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<Integer> {
    @Override
    public void accept(Integer num) {
        System.out.println(num + " ");
    }
}

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("\nPrinting the numbers using a enhanced for-loop/for-each loop");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\nPrinting the numbers using forEach method of Stream API");
        numbers.stream().forEach(num -> System.out.print(num + " "));
        System.out.println();

        // The above forEach with lambda expression can be representd as:
        numbers.stream().forEach(new ConsumerImpl());
        System.out.println();

        System.out.println("\nPrinting the numbers using method reference in forEach method");
        numbers.stream().forEach(System.out::println);
        System.out.println();
    }
}
