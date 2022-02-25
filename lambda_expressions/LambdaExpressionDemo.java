package lambda_expressions;

@FunctionalInterface
interface MyInterfaceA {
    int show(int val);
}

class ImplementorClass implements MyInterfaceA {
    public int show(int val) {
        System.out.println("Overridden inside another class " + val);
        return val + 5;
    }
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        MyInterfaceA obj1 = new ImplementorClass();
        obj1.show(5);

        // Using anonymous inner class instead
        MyInterfaceA obj2 = new MyInterfaceA() {
            public int show(int val) {
                System.out.println("Overridden inside anonymous inner class " + val);
                return val + 5;
            }
        };
        obj2.show(10);

        // Using lambda expression instead
        MyInterfaceA obj3 = value -> {
            System.out.println("Overridden inside a lambda expression " + value);
            return value + 5;
        };
        obj3.show(15);

        // Using optimised lambda expression instead
        MyInterfaceA obj = val -> 2 * val;
        System.out.println(obj.show(7));
    }
}
