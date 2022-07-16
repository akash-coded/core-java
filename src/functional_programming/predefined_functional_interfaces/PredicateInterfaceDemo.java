package src.functional_programming.predefined_functional_interfaces;

import java.util.function.Predicate;

class BooleanTest implements Predicate<Integer> {
    public boolean test(Integer num) {
        return num >= 10;
    }
}

public class PredicateInterfaceDemo {
    static Boolean checkAge(int age) {
        return age > 17;
    }

    public static void main(String[] args) {
        // Predicate<Integer> obj = new Predicate<Integer>() {
        // public boolean test(Integer num) {
        // return num >= 10;
        // }
        // };
        Predicate<Integer> predicate1 = num -> num >= 10;
        System.out.println(predicate1.test(51));

        Predicate<Integer> predicate2 = PredicateInterfaceDemo::checkAge;
        System.out.println(predicate2.test(26));
    }
}
