package src.oops_concepts.class_relationships.dependence;

interface Client {
}

class Customer implements Client {
    int customerId;
    String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
}

class Business implements Client {
    int businessId;
    String name;

    public Business(int businessId, String name) {
        this.businessId = businessId;
        this.name = name;
    }
}

public class DependencyDemo {
    private Client customer; // field dependency

    public DependencyDemo(Client customer) { // constructor dependency
        this.customer = customer;
    }

    public Client getCustomer() {
        return customer;
    }

    public void setCustomer(Client customer) { // setter dependency
        this.customer = customer;
    }

    private static DependencyDemo getDependencyDemoInstance(int id, String name, boolean isCustomer) { // factory method
        Client obj;

        if (isCustomer) {
            obj = new Customer(id, name);
        } else {
            obj = new Business(id, name);
        }

        return new DependencyDemo(obj);
    }

    public static void main(String[] args) {
        Customer customer = new Customer(123, "ABC");
        DependencyDemo obj1 = new DependencyDemo(customer);

        Business business = new Business(789, "XYZ");
        DependencyDemo obj2 = new DependencyDemo(business);

        DependencyDemo obj3 = getDependencyDemoInstance(456, "DEF", true);
    }
}
