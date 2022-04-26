package src.design_patterns.creational_patterns;

class RegularClass {
    int data = 10;
    static int classVariable = 100;

    @Override
    public String toString() {
        return "RegularClass [data=" + data + ", classVariable=" + classVariable + "]";
    }

}

class SingletonClass {
    // Step-1: declare a null static member reference of the class type
    private static volatile SingletonClass instance = null; // class variable
    int data = 50; // instance variable

    // Step-2: make the constructor private
    private SingletonClass() { // disables direct instantiation outside of this class
    }

    // Step-3: define a static factory method which returns the singleton instance
    public static SingletonClass getInstance() {
        if (instance == null) {

            // Step-4(a): no active objects
            // create a new instance
            instance = new SingletonClass(); // lazy initialization
        }

        // Step-4(b): return the instance
        return instance;
    }

    @Override
    public String toString() {
        return "SingletonClass [data=" + data + "]";
    }

}

public class SingletonDemo {
    int outerNum = 100; // instance variable
    static double outerDouble = 200; // class variable

    public static void main(String[] args) {
        int localNum = 20; // local variable

        System.out.println("Demonstrating RegularClass::");
        RegularClass regularObj1 = new RegularClass();
        RegularClass regularObj2 = new RegularClass();
        System.out.println("Address of regularObj1: " + regularObj1.hashCode());
        System.out.println("Address of regularObj2: " + regularObj2.hashCode());
        System.out.println(regularObj1);
        System.out.println(regularObj2);
        regularObj1.data = 20;
        regularObj1.classVariable = 200;
        System.out.println(regularObj1);
        System.out.println(regularObj2);
        System.out.println();

        System.out.println("Demonstrating SingletonClass::");
        SingletonClass singletonObj1 = SingletonClass.getInstance();
        SingletonClass singletonObj2 = SingletonClass.getInstance();
        System.out.println("Address of singletonObj1: " + singletonObj1.hashCode());
        System.out.println("Address of singletonObj2: " + singletonObj2.hashCode());
        System.out.println(singletonObj1);
        System.out.println(singletonObj2);
        singletonObj1.data = 70;
        System.out.println(singletonObj1);
        System.out.println(singletonObj2);
    }
}
