package src.lambda_expressions;

class MyClassB {
    interface MyInterfaceB {
        void show();
    }
}

class ImplInterface implements MyClassB.MyInterfaceB {
    public void show() {
        System.out.println("Overridden");
    }
}

public class LambdaForNestedInterface {
    public static void main(String[] args) {
        MyClassB.MyInterfaceB obj1 = new MyClassB.MyInterfaceB() {
            public void show() {
                System.out.println("Overridden inside anon inner class");
            }
        };
        obj1.show();

        MyClassB.MyInterfaceB obj2 = () -> System.out.println("Overridden inside lambda expression");
        obj2.show();
    }
}
