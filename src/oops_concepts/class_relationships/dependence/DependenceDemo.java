package src.oops_concepts.class_relationships.dependence;

class A {

}

class B {
    void display() {
        A obj = new A(); // uses-a relationship
        System.out.println(obj.getClass());
    }
}

public class DependenceDemo {
    public static void main(String[] args) {
        System.out.println("Class B uses an object of Class A");
        System.out.println("Class B uses an object of Class A");
    }
}
