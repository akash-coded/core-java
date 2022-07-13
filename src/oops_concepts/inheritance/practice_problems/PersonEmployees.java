package src.oops_concepts.inheritance.practice_problems;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

}

class Employee extends Person {
    private double salary;
    private int yearOfJoining;
    private String UAN;

    public Employee(String name, double salary, int yearOfJoining, String UAN) {
        super(name);
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
        this.UAN = UAN;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public String getUAN() {
        return UAN;
    }

    public void setUAN(String uAN) {
        this.UAN = uAN;
    }

    public boolean compareEmployeetoPerson(Person person) {
        return this.getName().equals(person.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (getName() == null) {
            if (other.getName() != null)
                return false;
        } else if (!getName().equals(other.getName()))
            return false;
        if (UAN == null) {
            if (other.UAN != null)
                return false;
        } else if (!UAN.equals(other.UAN))
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        if (yearOfJoining != other.yearOfJoining)
            return false;
        return true;
    }

    // public boolean isEqual(Employee otherEmp) {
    // if (this == otherEmp) {
    // return true;
    // } else if (this.getName().equals(otherEmp.getName())
    // && this.getSalary() == otherEmp.getSalary()
    // && this.getYearOfJoining() == otherEmp.getYearOfJoining()
    // && this.getUAN().equals(otherEmp.getUAN())) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    @Override
    public String toString() {
        return "Employee [name=" + super.getName() + ", UAN=" + UAN + ", salary=" + salary + ", yearOfJoining="
                + yearOfJoining + "]";
    }

}

public class PersonEmployees {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Employee employee1 = new Employee("Bob", 15000, 2019, "CNMD937319P");
        Employee employee2 = new Employee("John", 12500, 2020, "ANMD933459Z");
        Employee employee3 = new Employee("Bob", 15000, 2019, "CNMD937319P");

        System.out.println(person1);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println();

        if (employee1.compareEmployeetoPerson(person1)) {
            System.out.println("Person1 works as Employee1.");
        } else if (employee2.compareEmployeetoPerson(person1)) {
            System.out.println("Person1 works as Employee2.");
        } else {
            System.out.println("Person1 doesn't work as an Employee!");
        }

        if (employee1.equals(employee3)) {
            System.out.println("thisEmp is equal to otherEmp.");
        } else {
            System.out.println("thisEmp is not equal to otherEmp!");
        }
    }
}
