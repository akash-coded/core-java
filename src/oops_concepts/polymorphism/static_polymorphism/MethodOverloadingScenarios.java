package src.oops_concepts.polymorphism.static_polymorphism;

class MethodOverloading {
    /**
     * Method-1
     */
    void fun() {
        System.out.println("I am a method with no parameters");
    }

    /**
     * Method-2
     */
    void fun(String param) {
        System.out.println("I am a method with 1 String parameter: " + param);
    }

    /**
     * Method-3
     */
    void fun(int param) {
        System.out.println("I am a method with 1 integer parameter: " + param);
    }

    /**
     * Method-4
     */
    void fun(int param1, String param2) {
        System.out.printf("I am a method with 2 parameters: one integer %d and one String %s%n", param1, param2);
    }

    /**
     * Method-5
     */
    void fun(String param1, int param2) {
        System.out.printf("I am also a method with 2 parameters: one string %s and one integer %d%n", param1, param2);
    }
}

class NoMethodOverloadingWithReturnTypes {
    // // Not method overloading, but method hiding
    // static int add(int a, int b) {
    // System.out.println("Function with int return type executed");
    // return a + b;
    // }

    // // Unreachable
    // static double add(int a, int b) {
    // System.out.println("Function with double return type executed");
    // return a + b;
    // }
}

class MethodOverloadingWithTypePromotion {
    /**
     * Method-1
     */
    void fun() {
        System.out.println("I am a method with no parameters");
    }

    /**
     * Method-2
     */
    void fun(double param) {
        System.out.println("I am a method with 1 double parameter: " + param);
    }
}

class MethodOverloadingWithAmbiguousTypePromotion {
    /**
     * Method-1
     */
    void fun() {
        System.out.println("I am a method with no parameters");
    }

    /**
     * Method-2
     */
    void fun(float param) {
        System.out.println("I am a method with 1 float parameter: " + param);
    }

    /**
     * Method-3
     */
    void fun(double param) {
        System.out.println("I am a method with 1 double parameter: " + param);
    }
}

class NoMethodOverloadingWithTypePromotion {
    /**
     * Method-1
     */
    void fun() {
        System.out.println("I am a method with no parameters");
    }

    /**
     * Method-2
     */
    void fun(int param1, double param2) {
        System.out.printf("I am a method with 2 parameters: one integer %d and one double %f%n", param1, param2);
    }

    /**
     * Method-3
     */
    void fun(double param1, int param2) {
        System.out.printf("I am also a method with 2 parameters: one double %f and one integer %d%n", param1, param2);
    }
}

public class MethodOverloadingScenarios {
    public static void main() {
        System.out.println("User-defined main() method");
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.fun(); // calls method-1
        obj.fun("Hello!"); // calls method-2
        obj.fun(101); // call method-3
        obj.fun(11, "Eleven"); // call method-4
        obj.fun("Nineteen", 19); // call method-5

        // int sum1 = NoMethodOverloadingWithReturnTypes.add(11, 12);
        // double sum2 = NoMethodOverloadingWithReturnTypes.add(11, 12);
        // System.out.println("Sum stored in int variable = " + sum1);
        // System.out.println("Sum stored in double variable = " + sum2);

        // main(); // calls the non-parameterized main() method

        // MethodOverloadingWithTypePromotion obj2 = new
        // MethodOverloadingWithTypePromotion();
        // obj2.fun(); // calls method-1
        // obj2.fun(5.6); // calls method-2
        // int num = 4;
        // obj2.fun(num); // calls method-2 with type promotion

        // MethodOverloadingWithAmbiguousTypePromotion obj3 = new
        // MethodOverloadingWithAmbiguousTypePromotion();
        // obj3.fun(); // calls method-1
        // obj3.fun(5.6); // calls method-3
        // obj3.fun(6.3f); // calls method-2
        // obj3.fun(7);

        // NoMethodOverloadingWithTypePromotion obj4 = new
        // NoMethodOverloadingWithTypePromotion();
        // obj4.fun(); // calls method-1
        // obj4.fun(2, 5.6); // calls method-2
        // obj4.fun(5.6, 2); // calls method-3
        // obj4.fun(2, 5); // ambiuguous call
    }
}
