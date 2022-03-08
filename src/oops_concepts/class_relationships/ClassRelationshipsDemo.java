package src.oops_concepts.class_relationships;

class Engine {
    public void start() {
        System.out.println("Engine Started:");
    }

    public void stop() {
        System.out.println("Engine Stopped:");
    }
}

class Car {
    private String color;
    private int maxSpeed;

    public void carInfo() {
        System.out.println("Car Color= " + color + " Max Speed= " + maxSpeed);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

class Maruti extends Car { // IS-A relationship
    // Maruti extends Car and thus inherits all methods from Car (except final and
    // static)
    // Maruti can also define all its specific functionality
    public void marutiStartDemo() {
        Engine marutiEngine = new Engine(); // HAS-A relationship
        marutiEngine.start();
    }
}

public class ClassRelationshipsDemo {
    public static void main(String[] args) {
        Maruti myMaruti = new Maruti();
        myMaruti.setColor("RED");
        myMaruti.setMaxSpeed(180);
        myMaruti.carInfo();
        myMaruti.marutiStartDemo();
    }
}
