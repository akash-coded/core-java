package src.collections.iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Fail fast iterators in Java disallow any type of structural modification to a
 * collection while iterating over it. Structural Modification includes adding,
 * removing or updating any element in the collection while iterating over it.
 * The iterator throws a ConcurrentModificationException, if a collection is
 * structurally modified during the process of iteration.
 * 
 * However, it must be noted that if an item is removed using the iterators own
 * method i.e. the remove() method, no exception is thrown.
 */
public class FailFastDemo {

    public static void main(String[] args) {
        Map<String, String> monthIndex = new HashMap<>();
        monthIndex.put("1", "January");
        monthIndex.put("2", "February");
        monthIndex.put("3", "March");

        Iterator<String> iterator = monthIndex.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(monthIndex.get(iterator.next()));
            // adding an element to Map
            // exception will be thrown on next call
            // of next() method.
            monthIndex.put("4", "April");
        }
    }
}
