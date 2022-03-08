package src.collections.maps;

import java.util.HashMap;
import java.util.Map;

class Key {
    String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        return key.codePointAt(0);
    }

    @Override
    public boolean equals(Object obj) {
        return key.equals((String) obj);
    }

}

class Node {
    int hash;
    TreeKey key;
    Integer value;
    Node next;

    public Node(int hash, TreeKey key, Integer value, Node next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

}

public class HashMapWorking {
    public static void main(String[] args) {
        Map<TreeKey, Integer> map = new HashMap<>();

        map.put(new TreeKey("vishal"), 20);
        map.put(new TreeKey("sachin"), 30);
        map.put(new TreeKey("vaibhav"), 40); // collision

        int value1 = map.get(new TreeKey("sachin")); // no collision
        int value2 = map.get(new TreeKey("vaibhav")); // collision

        System.out.println(value1);
        System.out.println(value2);
    }
}
