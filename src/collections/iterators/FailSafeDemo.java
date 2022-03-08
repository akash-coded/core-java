package src.collections.iterators;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Unlike Fail Fast iterators, Fail Safe iterators don’t throw any exceptions if
 * the collection is modified during the process of iteration. This is due to
 * the fact that they iterate on the clone of the collection, instead of the
 * actual collection. The structural modifications done on the actual collection
 * goes unnoticed by them.
 * 
 * However, it should be noticed that there is no such thing as a truly Fail
 * Safe Iterator. It would be appropriate to term it as Weakly-Consistent.
 */
public class FailSafeDemo {
    public static void main(String[] args) {
        ConcurrentMap<String, String> monthIndex = new ConcurrentHashMap<>();

        monthIndex.put("1", "January");
        monthIndex.put("2", "February");
        monthIndex.put("3", "March");

        Iterator<String> iterator = monthIndex.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(monthIndex.get(iterator.next()));
            monthIndex.put("4", "April");
        }
    }
}
