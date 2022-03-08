package src.design_patterns;

class Person {
    int id; // instance variable
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class PersonBuilder {
    private static Person buildPerson() { // factory method
        int id = 123;
        String name = "A Person";

        return new Person(id, name);
    }

    public static void main(String[] args) {
        int id = 23;
        String name = "John";
        Person person = null;
        person = buildPerson();
    }
}
