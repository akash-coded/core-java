package src.collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("One", "1");
        map.put("Five", "5");
        map.put("Four", "4");
        map.put("Two", "2");
        map.put("Three", "3");
        System.out.println("HashMap: \n" + map);
        System.out.println();

        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("One", "1");
        map1.put("Five", "5");
        map1.put("Four", "4");
        map1.put("Two", "2");
        map1.put("Three", "3");
        System.out.println("LinkedHashMap: \n" + map1);
        System.out.println();

        Map<String, String> map2 = new TreeMap<>();
        map2.put("One", "1");
        map2.put("Five", "5");
        map2.put("Four", "4");
        map2.put("Two", "2");
        map2.put("Three", "3");
        System.out.println("TreeMap: \n" + map2);
        System.out.println();

        System.out.println("Set of keys::");
        for (String key : map2.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        System.out.println("List of values::");
        for (String value : map2.values()) {
            System.out.println(value);
        }
        System.out.println();

        System.out.println("Set of map entries::");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();

        System.out.println("Using forEach() method to iterate over a map::");
        map2.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();
    }
}
