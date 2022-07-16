package src.classes_and_objects.anonymous_inner_classes;

abstract class AbstractClass {
    abstract void method1();
}

class ConcreteClass extends AbstractClass {
    @Override
    void method1() {
        System.out.println("Concrete method 1");
    }
}

@FunctionalInterface
interface Interface {
    void method2();
}

class InterfaceImpl implements Interface {
    @Override
    public void method2() {
        System.out.println("Concrete method 2");
    }
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        AbstractClass obj1 = new AbstractClass() {
            @Override
            void method1() {
                System.out.println("Concrete method 1");
            }
        };
        obj1.method1();

        Interface obj2 = new Interface() {
            @Override
            public void method2() {
                System.out.println("Concrete method 2");
            }
        };
        obj2.method2();
    }
}
