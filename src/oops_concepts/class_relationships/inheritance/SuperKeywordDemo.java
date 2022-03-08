package src.oops_concepts.class_relationships.inheritance;

class Parent {
    String firstname;
    String lastname;
    String designation = "Sr.";

    Parent() {
        this.lastname = "Das";
    }

    Parent(String firstname) {
        this();
        this.firstname = firstname;
    }

    Parent(String firstname, String designation) {
        this(firstname);
        this.designation = designation;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return String.format("Firstname: %s %nLastname: %s %nDesignation: %s", this.firstname, this.lastname,
                this.designation);
    }
}

class Child extends Parent {
    Child() {
        // super();
    }

    Child(String firstname) {
        super(firstname, "Jr.");
        // this.firstname = firstname;
    }

    @Override
    public String toString() {
        System.out.println("CHILD OBJECT::");
        return super.toString();
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Parent parent = new Parent("Akash");
        System.out.println(parent);

        Child c = new Child("Akash");
        System.out.println(c);
    }
}
