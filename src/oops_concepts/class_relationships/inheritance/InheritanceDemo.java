package src.oops_concepts.class_relationships.inheritance;

class Animal {
}

class Mammal extends Animal {
}

class Dog extends Mammal {
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();

        System.out.println(a instanceof Animal);
        System.out.println(m instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}
