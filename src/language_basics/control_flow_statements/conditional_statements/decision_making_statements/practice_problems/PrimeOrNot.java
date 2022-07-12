package src.language_basics.control_flow_statements.conditional_statements.decision_making_statements.practice_problems;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 17;
        int i;

        for (i = 2; i <= num / 2; i++) {
            if (num % 2 == 0 || num % i == 0) {
                break;
            }
        }

        System.out.println(i);

        if (i == (num / 2 + 1)) {
            System.out.println("Prime.");
        } else {
            System.out.println("Not Prime!");
        }
    }
}
