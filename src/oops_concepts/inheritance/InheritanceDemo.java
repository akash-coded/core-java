package src.oops_concepts.inheritance;

class Employee {
    double salary = 40000;
}

class Programmer extends Employee {
    int bonus = 10000;
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}

/**
 * Why And When To Use "Inheritance"?
 * - It is useful for code reusability: reuse attributes and methods of an
 * existing class when you create a new class.
 * 
 * Tip: Also take a look Polymorphism, which uses inherited
 * methods to perform different tasks.
 */

/**
 * If you don't want other classes to inherit from a class, use the final
 * keyword. If you try to extend a final class, Java will generate an error
 */
// final class Vehicle {

// }

// class Car extends Vehicle {
// }