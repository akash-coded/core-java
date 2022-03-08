package src.collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

class LinkedKey {
    String key;

    public LinkedKey(String key) {
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

class LinkedNode {
    int hash;
    TreeKey key;
    String value;
    LinkedNode before;
    LinkedNode after;

    public LinkedNode(int hash, TreeKey key, String value, LinkedNode before, LinkedNode after) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.before = before;
        this.after = after;
    }

}

public class LinkedHashMapWorking {
    public static void main(String[] args) {
        Map<TreeKey, String> map = new LinkedHashMap<>();

        map.put(new TreeKey("Dinesh"), "Dinesh");
        map.put(new TreeKey("Anamika"), "Anamika");
        map.put(new TreeKey("Arnav"), "Arnav"); // collision

        String value1 = map.get(new TreeKey("Dinesh"));
        String value2 = map.get(new TreeKey("Arnav")); // collision

        System.out.println(value1);
        System.out.println(value2);
    }
}
