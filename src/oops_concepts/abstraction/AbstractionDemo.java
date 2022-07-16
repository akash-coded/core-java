package src.oops_concepts.abstraction;

/**
 * Data abstraction is the process of hiding certain details and showing only
 * essential information to the user.
 * 
 * Consider a real-life example of a man driving a car. The man only knows that
 * pressing the accelerators will increase the speed of a car or applying brakes
 * will stop the car, but he does not know about how on pressing the accelerator
 * the speed is actually increasing, he does not know about the inner mechanism
 * of the car or the implementation of the accelerator, brakes, etc in the car.
 * This is what abstraction is.
 * 
 * Abstraction can be achieved with either abstract classes or interfaces
 */

// abstract class
abstract class Car {
    abstract void accelerate();

    final void showNumberPlate() {
        System.out.println("Indian number plate");
    }
}

// concrete class
class Suzuki extends Car {
    @Override
    void accelerate() {
        System.out.println("Suzuki::accelerate");
    }

    void showCustomNumberPlate() {
        System.out.println("Suzuki custom number plate");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Car obj = new Suzuki(); // Car object => contents of Suzuki
        obj.accelerate(); // call the method
        // obj.showCustomNumberPlate();
    }
}

/**
 * Advantages of Abstraction:
 * 
 * - It reduces the complexity of viewing the things.
 * - Avoids code duplication and increases reusability.
 * - Helps to increase the security of an application or program as only
 * important details are provided to the user.
 */

/**
 * Encapsulation vs Data Abstraction
 * 
 * 1. Encapsulation is data hiding(information hiding) while Abstraction is
 * detailed hiding(implementation hiding).
 * 2. While encapsulation groups together data and methods that act upon the
 * data, data abstraction deal with exposing the interface to the user and
 * hiding the details of implementation.
 */
