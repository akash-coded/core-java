package src.oops_concepts.polymorphism.dynamic_polymorphism;

class Base {
    void add(int x, int y) {
        System.out.println("Addition results in " + (x + y));
    }
}

class Derived1 extends Base {
    // @Override
    void add(int x, int y, int z) {
        System.out.println("Sum of three numbers is " + (x + y + z));
    }
}

class Derived2 extends Base {
    @Override
    void add(int x, int y) {
        super.add(x, y);
        System.out.println("Sum = " + (x + y));
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Base b = new Base();
        Derived1 d1 = new Derived1();
        Derived2 d2 = new Derived2();

        b.add(2, 3);
        d1.add(2, 3);
        d1.add(2, 3, 4);
        d2.add(2, 3);
    }
}
