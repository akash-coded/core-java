package src.language_basics.methods.practice_problems;

class CalculatorOperations {
    protected static int add(int a, int b) { // code modularity
        return a + b;
    }

    protected static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    protected static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    protected static void divide(int a, int b) {
        System.out.println(a / b);
    }

    protected static void modulus(int a, int b) {
        System.out.println(a % b);
    }
}

public class Calculator {
    public static void main(String[] args) {
        int sum = CalculatorOperations.add(5, 6);
        System.out.println(sum);

        CalculatorOperations.subtract(5, 6);
        CalculatorOperations.multiply(5, 6);
        CalculatorOperations.divide(5, 6);
        CalculatorOperations.modulus(5, 6);

        System.out.println(CalculatorOperations.add(11, 10)); // code reusability
    }
}
