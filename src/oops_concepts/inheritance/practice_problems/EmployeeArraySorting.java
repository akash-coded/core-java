package src.oops_concepts.inheritance.practice_problems;

public class EmployeeArraySorting {

    public static void bubbleSort(Employee[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; ++i) {
            for (int j = 0; j < len - i - 1; ++j) {
                if (arr[j + 1].getSalary() < arr[j].getSalary()) {
                    Employee swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob", 15000, 2019, "CNMD937319P");
        Employee employee2 = new Employee("John", 12500, 2020, "ANMD933459Z");
        Employee employee3 = new Employee("Bob", 15000, 2019, "CNMD937319P");

        Employee[] employees = { employee1, employee2, employee3 };
        bubbleSort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
