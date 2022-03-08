package src.oops_concepts.class_relationships.inheritance.types_of_inheritance;

class A {
    void msg() {
        System.out.println("Hello");
    }
}

class B {
    void msg() {
        System.out.println("Welcome");
    }
}

// class C extends A,B{ //suppose if it were allowed
// }

public class DiamondProblemDemo {
    public static void main(String[] args) {
        // C obj = new C();
        // obj.msg();// Now which msg() method would be invoked?
    }
}
