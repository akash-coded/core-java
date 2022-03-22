package src.design_patterns.creational_patterns;

class RegularClass {

}

class SingletonClass {
    private static volatile SingletonClass instance = null;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass(); // lazy initialization
        }
        return instance;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("Regular Class Objects::");
        RegularClass regularObj1 = new RegularClass();
        RegularClass regularObj2 = new RegularClass();
        System.out.println(regularObj1.hashCode());
        System.out.println(regularObj2.hashCode());

        System.out.println("\nSingleton Class Objects::");
        SingletonClass singletonObj1 = SingletonClass.getInstance();
        SingletonClass singletonObj2 = SingletonClass.getInstance();
        System.out.println(singletonObj1.hashCode());
        System.out.println(singletonObj2.hashCode());
    }
}
