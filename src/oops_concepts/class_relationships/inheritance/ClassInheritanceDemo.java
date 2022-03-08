package src.oops_concepts.class_relationships.inheritance;

class Vehicle {
    protected String brand = "Ford"; // Vehicle attribute

    public void honk() { // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    String modelName = "Mustang"; // Car attribute
}

public class ClassInheritanceDemo {
    public static void main(String[] args) {
        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the
        // value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

/**
 * Did you notice the protected modifier in Vehicle?
 * 
 * We set the brand attribute in Vehicle to a protected access modifier. If it
 * was set to private, the Car class would not be able to access it.
 */
