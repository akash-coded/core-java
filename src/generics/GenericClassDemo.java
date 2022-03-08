package src.generics;

import java.util.List;

class IntegerClass {
    Integer num;

    public IntegerClass(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}

class DoubleClass {
    Double num;

    public DoubleClass(Double num) {
        this.num = num;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }
}

class GenericClass<T> {
    T num;

    public GenericClass(T num) {
        this.num = num;
    }

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public void displayType() {
        System.out.println(this.num.getClass().getSimpleName());
    }
}

public class GenericClassDemo {
    public static void main(String[] args) {
        IntegerClass myInteger = new IntegerClass(10);

        GenericClass<Integer> myGeneric1 = new GenericClass<>(10);
        myGeneric1.displayType();
        GenericClass<Double> myGeneric2 = new GenericClass<>(10.5);
        myGeneric2.displayType();

        GenericClass<IntegerClass> myGeneric3 = new GenericClass<>(myInteger);
        myGeneric3.displayType();

        GenericClass<int[]> myGeneric4 = new GenericClass<>(new int[] { 1, 2, 3 });
        myGeneric4.displayType();
    }
}
