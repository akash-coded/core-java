package src.oops_concepts.abstraction.interfaces;

/**
 * Interfaces provide 100% abstraction
 */

// Interface
interface Animal {
    String creatureType = "Animal";

    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)

    default void defaultMethod() {
        System.out.println("I am a default method declared in the interface.");
        privateMethod();
        staticPrivateMethod();
    }

    static void staticMethod() {
        System.out.println("I am a static method declared in the interface.");
        staticPrivateMethod();

    }

    private void privateMethod() {
        System.out.println("I am a non-static private method in the interface.");
    }

    private static void staticPrivateMethod() {
        System.out.println("I am a static private method in the interface.");
    }
}

// Pig "implements" the Animal interface
class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
        myPig.defaultMethod();
        Animal.staticMethod();
    }
}
