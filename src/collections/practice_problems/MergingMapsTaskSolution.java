package src.collections.practice_problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergingMapsTaskSolution {

    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<>();
        Map<Integer, String> m2 = new HashMap<>();

        m1.put(1, "A");
        m1.put(2, "B");

        m2.put(1, "C");
        m2.put(2, "D");

        Map<Integer, List<String>> merged = Stream.concat(m1.entrySet().stream(), m2.entrySet().stream()).collect(
                Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())));

        System.out.println(merged);
    }
}
