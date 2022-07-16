package src.generics;

class NumericClass<T extends Number> {
    T num;

    public NumericClass(T num) {
        this.num = num;
    }

    public boolean absEquals(NumericClass<?> other) { // unbounded wildcard
        return Math.abs(this.num.intValue()) == Math.abs(other.num.intValue());
    }
}

public class WildcardDemo {
    public static void main(String[] args) {
        NumericClass<Integer> obj1 = new NumericClass<>(3);

        NumericClass<Integer> obj2 = new NumericClass<>(4);
        System.out.println(obj1.absEquals(obj2));

        NumericClass<Double> obj3 = new NumericClass<>(-3.67);
        System.out.println(obj1.absEquals(obj3));
    }
}