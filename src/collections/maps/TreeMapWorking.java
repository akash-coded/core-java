package src.collections.maps;

import java.util.Map;
import java.util.TreeMap;

// Standard Comparable
class TreeKey implements Comparable<TreeKey> {

    // Custom input
    final int data = 118;
    private String key;

    // Constructor of this class
    public TreeKey(String key) {
        // Super keyword refers immediate parent class
        // object
        super();

        // This keyword is a reference variable
        // referring to current object
        this.key = key;
    }

    // Print Key method
    public String printKey() {
        return this.key;
    }

    // Override compareTo method
    @Override
    public int compareTo(TreeKey obj) {
        return key.compareTo(obj.key);
    }
}

// Main Class
class TreeMapWorking {

    // Main driver method
    public static void main(String[] args) {
        // Initialize TreeMap
        // Declaring object of String type
        Map<TreeKey, String> treemap = new TreeMap<>();

        // Adding the elements in object of TreeMap
        // Custom inputs
        treemap.put(new TreeKey("Key1"), "Alice");
        treemap.put(new TreeKey("Key4"), "Zeya");
        treemap.put(new TreeKey("Key3"), "Geek");
        treemap.put(new TreeKey("Key2"), "Bob");

        // Iterate over object elements using for-each loop
        for (Map.Entry<TreeKey, String> entry : treemap.entrySet())

            // Print elements in TreeMap object
            System.out.println(
                    "[" + entry.getKey().printKey() + " = "
                            + entry.getValue() + "]");
    }
}
