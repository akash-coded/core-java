package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImplementor implements Consumer<Integer> {
    public void accept(Integer ele) {
        System.out.println(ele);
    }
}

public class ConsumerInterfaceDemo {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();

        myList.add(1);
        myList.add(2);
        myList.add(3);

        Consumer<Integer> obj1 = new ConsumerImplementor();
        myList.forEach(obj1); // Consumer interface object

        Consumer<Integer> obj2 = new Consumer<Integer>() {
            public void accept(Integer ele) {
                System.out.println(ele);
            }
        };
        myList.forEach(obj2);

        myList.forEach(new Consumer<Integer>() {
            public void accept(Integer ele) {
                System.out.println(ele);
            }
        }); // anonymous object of an anonymous inner class

        myList.forEach(ele -> System.out.println(ele)); // lambda expression

        myList.forEach(System.out::println); // method reference
    }
}
