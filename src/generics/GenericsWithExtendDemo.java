package src.generics;

class NumberClass<T extends Number> {
    T num;

    public NumberClass(T num) {
        this.num = num;
    }

    double square() {
        return num.intValue() * num.intValue();
    }
}

public class GenericsWithExtendDemo {
    public static void main(String[] args) {
        NumberClass<Integer> obj = new NumberClass<>(3);
        System.out.println(obj.square());
    }
}
