package src.oops_concepts.inheritance;

class Employee {
    double salary = 40000;

    void showGrossSalary() {
        System.out.println("Salary: " + salary);
    }

    void displayEmployeeType() {
        System.out.println(this.getClass().getSimpleName());
    }
}

class Programmer extends Employee {
    int bonus = 10000;

    @Override
    void showGrossSalary() {
        System.out.println("Salary: " + (salary + bonus));
    }
}

class Manager extends Employee {
    int bonus = 30000;
    int stockBonus = 60000;

    @Override
    void showGrossSalary() {
        System.out.println("Salary: " + (salary + bonus + stockBonus));
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: " + p.salary);
        System.out.println("Bonus of Programmer is: " + p.bonus);
        p.showGrossSalary();
        p.displayEmployeeType();
        System.out.println();

        Employee employee = new Employee();
        System.out.println("Employee salary is: " + employee.salary);
        employee.showGrossSalary();
        employee.displayEmployeeType();
        System.out.println();

        Manager manager = new Manager();
        System.out.println("Manager salary is: " + manager.salary);
        System.out.println("Bonus of Manager is: " + manager.bonus);
        System.out.println("Stock Bonus of Programmer is: " + manager.bonus);
        manager.showGrossSalary();
        manager.displayEmployeeType();
        System.out.println();
    }
}

/**
 * Why And When To Use "Inheritance"?
 * - It is useful for code reusability: reuse attributes and methods of an
 * existing class when you create a new class.
 * 
 * Tip: Also take a look Polymorphism, which uses inherited
 * methods to perform different tasks.
 */

/**
 * If you don't want other classes to inherit from a class, use the final
 * keyword. If you try to extend a final class, Java will generate an error
 */
// final class Vehicle {

// }

// class Car extends Vehicle {
// }