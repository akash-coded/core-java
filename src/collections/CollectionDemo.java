package src.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class CollectionDemo {
    public static void main(String[] args) {
        // Creating a collection
        ArrayList<Integer> list1 = new ArrayList<>();

        // Adding elements to a collection
        list1.add(5);
        list1.add(1);
        list1.add(7);
        list1.add(10);

        // Iterating over a collection
        System.out.println("Original list (List-1):: ");
        Iterator<Integer> itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();

        // Finding the size of the collection
        System.out.print("No. of elements in List-1 = ");
        System.out.println(list1.size());
        System.out.println();

        // Bi-directional iteration using ListIterator
        ListIterator<Integer> listItr = list1.listIterator();
        System.out.println("Printing List-1 forwards:: ");
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        System.out.println("Printing List-1 backwards:: ");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
        System.out.println();

        // Accessing an element of a collection
        System.out.print("Third element of List-1 = ");
        System.out.println(list1.get(2)); // retrieves the element at index-2
        System.out.println();

        // Removing an element from a collection
        Integer elementToBeRemoved = 10;
        list1.remove(elementToBeRemoved); // using Integer argument removes that object
        System.out.println("List-1 after removal of 10:: ");
        Iterator<Integer> itr2 = list1.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        System.out.println();

        // Removing an element at a given index from a collection
        list1.remove(0); // using int argument removes the element at that index
        System.out.println("List-1 after removal of the first element:: ");
        for (Integer ele : list1) {
            System.out.println(ele);
        }
        System.out.println();

        // Modifying an element of a collection
        list1.set(1, 100);
        System.out.println("List-1 after modification:: ");
        Consumer<Integer> consumer = new Consumer<>() {
            @Override
            public void accept(Integer ele) {
                System.out.println(ele);
            }
        };
        list1.forEach(consumer);
        System.out.println();

        // Copying a collection
        System.out.println("Cloned list (List-2):: ");
        ArrayList<Integer> list2 = (ArrayList<Integer>) list1.clone();
        Iterator<Integer> itr3 = list2.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }
        System.out.println();

        // Sorting a collection in ascending order
        Collections.sort(list2);
        System.out.println("List-2 after sorting  in ascending order:: ");
        list2.forEach(ele -> System.out.println(ele));
        System.out.println();

        // Sorting a collection in descending order
        System.out.println("List-2 after sorting in descending order:: ");
        Collections.sort(list2, Collections.reverseOrder());
        list2.forEach(System.out::println);
        System.out.println();

        // Displaying a collection
        System.out.println("Dsiplaying List-2:: ");
        System.out.println(list2);
    }
}
