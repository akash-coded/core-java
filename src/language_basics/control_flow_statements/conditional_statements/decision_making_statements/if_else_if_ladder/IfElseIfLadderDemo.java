package src.language_basics.control_flow_statements.conditional_statements.decision_making_statements.if_else_if_ladder;

public class IfElseIfLadderDemo {

    public static void main(String[] args) {
        int number = 0;

        /**
         * Using nested if-else statements
         */
        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive: " + number);
        } else {
            // checks if number is less than 0
            if (number < 0) {
                System.out.println("The number is negative: " + number);
            } else { // if both the conditions are false
                System.out.println("The number is zero: " + number);
            }
        }

        /**
         * Using if-else-if ladder
         */
        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive: " + number);
        }

        // checks if number is less than 0
        else if (number < 0) {
            System.out.println("The number is negative: " + number);
        }

        // if both the conditions are false
        else {
            System.out.println("The number is zero: " + number);
        }
    }

}
