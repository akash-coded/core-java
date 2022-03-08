package src.collections.maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapOperationsDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(20, "DEF");
        map.put(10, "ABC");
        map.put(30, "GHI");

        System.out.println("Original HashMap is:: ");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
        System.out.println();

        System.out.println("Sorted HashMap is:: ");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
        System.out.println();

        map.put(20, "XYZ");
        System.out.println("HashMap after insertion:: ");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
        System.out.println();

        map.replace(20, "XYZ", "DEF");
        System.out.println("Updated HashMap is:: ");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
        System.out.println();

        map.replaceAll((k, v) -> null);
        System.out.println("HashMap after replacement:: ");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
        System.out.println();
    }
}
