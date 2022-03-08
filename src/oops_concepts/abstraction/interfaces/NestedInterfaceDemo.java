package src.oops_concepts.abstraction.interfaces;

interface Doable {
    void doSomething();

    interface AlsoDoable {
        void doSomething(int x);

        void doSomethingElse();
    }
}

class Outer {
    static int x = 10;
    int y = 20;

    protected interface Inner {
        void show();

        static void displayX() {
            System.out.println("Printing from static function of nested interface" + x);
        }

        default void displayY() {
            Outer obj = new Outer();
            System.out.println("Printing from default function of nested interface" + obj.y);
        }
    }
}

class Implementor implements Doable, Doable.AlsoDoable, Outer.Inner {
    @Override
    public void doSomething() {
        System.out.println("Printing something on behalf of the outer interface");
    }

    @Override
    public void doSomething(int x) {
        System.out.println("Printing something on behalf of the inner interface");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("Printing something else on behalf of the inner interface: ");
    }

    @Override
    public void show() {
        System.out.println("Printing something else on behalf of the interface inside a class: ");
    }
}

public class NestedInterfaceDemo {
    public static void main(String[] args) {
        Implementor i = new Implementor();
        i.doSomething();
        i.doSomething(5);
        i.doSomethingElse();
        i.show();
        Outer.Inner.displayX();
        i.displayY();
    }
}
