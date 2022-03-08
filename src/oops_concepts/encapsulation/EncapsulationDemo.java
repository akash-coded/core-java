package src.oops_concepts.encapsulation;

class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Person myObj = new Person();

        // myObj.name = "John"; // error
        // System.out.println(myObj.name); // error

        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }
}

/**
 * Why Encapsulation?
 * 
 * Better control of class attributes and methods
 * Class attributes can be made read-only (if you only use the get method), or
 * write-only (if you only use the set method)
 * Flexible: the programmer can change one part of the code without affecting
 * other parts
 * Increased security of data
 */
