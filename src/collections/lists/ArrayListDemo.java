package src.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(1);
        list1.add(7);
        list1.add(10);

        Iterator<Integer> itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        list1.remove(3);
        Iterator<Integer> itr2 = list1.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println(list1.get(2));
        System.out.println("Main completed");

        System.out.println("Cloned list before removal:: ");
        ArrayList<Integer> list2 = (ArrayList<Integer>) list1.clone();
        Iterator<Integer> itr3 = list2.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        list1.remove(0);
        System.out.println("After removal - ");
        System.out.println("List-1:: ");
        Iterator<Integer> itr4 = list1.iterator();
        while (itr4.hasNext()) {
            System.out.println(itr4.next());
        }

        list1.set(1, 100);
        System.out.println("List-2:: ");
        for (Integer ele : list2) {
            System.out.println(ele);
        }

        Collections.sort(list2);
        list2.forEach(ele -> System.out.println(ele));

        Collections.sort(list2, Collections.reverseOrder());
        list2.forEach(System.out::println);
    }
}
