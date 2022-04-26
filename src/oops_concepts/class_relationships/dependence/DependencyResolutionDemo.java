package src.oops_concepts.class_relationships.dependence;

class Dependency {
    private int data;

    public Dependency() {
    }

    public Dependency(int data) {
        this.data = data;
    }

    // getter or accessor method
    public int getData() {
        return data;
    }

    // setter or mutator method
    public void setData(int data) {
        this.data = data;
    }
}

class Container {
    /**
     * In a class, if you have the object reference of another class present
     * as a data member, then it is known as a dependency
     */

    Dependency dependency; // dependency

    public Container(Dependency dependency) {
        this.dependency = dependency;
    }

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return "Container [Dependency [data=" + dependency.getData() + "]]";
    }
}

public class DependencyResolutionDemo {
    /**
     * The process of providing an instance of the dependency
     * class to the Container class is known as
     * dependency resolution. The
     * 
     * It can be done in three ways:
     * - Constructor resolution (via the constructor)
     * - Setter resolution (via the setter method)
     * - Field/Property resolution (directly by accessing the data member)
     * 
     */
    public static void main(String[] args) {
        System.out.println("Constructor resolution::");
        Dependency dependencyObj1 = new Dependency(10);
        Container container = new Container(dependencyObj1); // Constructor resolution
        System.out.println(container);
        System.out.println();

        System.out.println("Setter resolution::");
        Dependency dependencyObj2 = new Dependency(20);
        container.setDependency(dependencyObj2); // Setter resolution
        System.out.println(container);
        System.out.println();

        System.out.println("Field/Property resolution::");
        Dependency dependencyObj3 = new Dependency(30);
        container.dependency = dependencyObj3; // Property resolution
        System.out.println(container);
        System.out.println();
    }
}
