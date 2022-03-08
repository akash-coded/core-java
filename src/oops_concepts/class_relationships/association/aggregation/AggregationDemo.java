package src.oops_concepts.class_relationships.association.aggregation;

class Address {
    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Address address1 = new Address("gzb", "UP", "India");
        Address address2 = new Address("gno", "UP", "India");

        Employee e = new Employee(111, "Varun", address1);
        Employee e2 = new Employee(112, "Arun", address2);

        e.display();
        e2.display();
    }
}
