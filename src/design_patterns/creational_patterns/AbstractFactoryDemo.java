package src.design_patterns.creational_patterns;

/**
 * Product Family - Furniture
 * Product - Chair
 */
interface Chair {
    boolean hasLegs();

    void sitOn();
}

/**
 * Product Family - Furniture
 * Product - Chair
 * Variant Type - Victorian
 */
class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    public void sitOn() {
        System.out.println("I am sat on a Victorian Chair");
    }
}

/**
 * Product Family - Furniture
 * Product - Chair
 * Variant Type - Modern
 */
class ModernChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    public void sitOn() {
        System.out.println("I am sat on a Modern Chair");
    }
}

/**
 * Product Family - Furniture
 * Product - Sofa
 */
interface Sofa {
    boolean hasLegs();

    void sitOn();
}

/**
 * Product Family - Furniture
 * Product - CoffeeTable
 */
interface CoffeeTable {
    boolean hasLegs();

    void keepOn();
}

// TODO:Implement the variants of Sofa and CoffeeTable products

/**
 * Abstract Factory
 * Product Family - Furniture
 * Products - Chair, Sofa, and CoffeeTable
 */
interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}

/**
 * Concrete Factory
 * Product Family - Furniture
 * Variant Type - Victorian
 */
class VictorianFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }

    // TODO:Implement appropriate object creation
    public Sofa createSofa() {
        return null;
    }

    // TODO:Implement appropriate object creation
    public CoffeeTable createCoffeeTable() {
        return null;
    }
}

/**
 * Concrete Factory
 * Product Family - Furniture
 * Variant Type - Modern
 */
class ModernFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    // TODO:Implement appropriate object creation
    public Sofa createSofa() {
        return null;
    }

    // TODO:Implement appropriate object creation
    public CoffeeTable createCoffeeTable() {
        return null;
    }
}

class Client {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    Client(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.coffeeTable = factory.createCoffeeTable();
    }

    void useFurniture() {
        this.chair.sitOn();
        // TODO: Uncomment and use Sofa and CoffeeTable
        // this.sofa.sitOn();
        // this.coffeeTable.keepOn();

        // TODO:For each furniture, print whether it has legs or not
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFactory();
        Client client = new Client(factory);
        client.useFurniture();

        // TODO:Test VictorianFactory as well
    }
}
