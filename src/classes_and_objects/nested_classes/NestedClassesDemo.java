package src.classes_and_objects.nested_classes;

/**
 * Nested inner class
 */
class UserAddress { // outer
    String state = "Delhi";

    class Location { // inner
        String city = "Wasseypur";
        String state = "Uttar Pradesh";

        void displayLocation() {
            System.out.print("Inside inner Location class method. ");
            System.out.println("I can access state of outer class:: " + new UserAddress().state);
            System.out.println("State of inner class:: " + this.state);
        }
    }

    void displayLocation() {
        System.out.print("Inside outer UserAddress class method");
        System.out.println("I cannot access city of inner class.");
    }
}

/**
 * Method local inner class
 */
class DressSense { // outer
    String brand = "Supreme";

    void showDressSense() {
        System.out.println("Inside a local method of outer DressSense class");

        class Garments { // method local inner
            String upperGarment;
            String lowerGarment;

            void showGarments() {
                System.out.println("Inside a method of inner Garments class");
                System.out.println("I can access brand of outer class:: " + brand);
            }
        }

        Garments obj = new Garments();
        obj.showGarments();
    }
}

/**
 * Static nested class
 */
class Tata { // outer

    void displayParentCompany() {
        System.out.println("Outer class:: Tata");
    }

    static void displayOriginCountry() {
        System.out.println("Country of Origin:: India");
    }

    static class TataMotors { // static nested - 1
        void display() {
            System.out.println("Inside a non-static method of static nested class - TataMotors");
            // displayParentCompany();
            displayOriginCountry();
        }
    }

    static class TataSteel { // static nested - 2
        static void display() {
            System.out.println("Inside a static method of static nested class - TataSteel");
            displayOriginCountry();
        }
    }
}

public class NestedClassesDemo {
    public static void main(String[] args) {
        UserAddress address = new UserAddress();
        UserAddress.Location location = address.new Location();
        location.displayLocation();
        address.displayLocation();

        DressSense dressSense = new DressSense();
        dressSense.showDressSense();

        Tata.TataMotors tataMotors = new Tata.TataMotors();
        tataMotors.display();
        Tata.TataSteel.display();
    }
}
