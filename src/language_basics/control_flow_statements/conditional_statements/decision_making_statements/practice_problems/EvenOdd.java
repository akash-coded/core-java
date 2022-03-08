package src.language_basics.control_flow_statements.conditional_statements.decision_making_statements.practice_problems;

public class EvenOdd {
    protected static boolean checkEven(int num) {
        // if (num % 2 == 0) {
        // return true;
        // } else {
        // return false;
        // }

        // return (num % 2 == 0) ? true : false;

        return (num % 2 == 0);
    }

    public static void main(String[] args) {
        int num = 5;
        if (checkEven(num)) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}
