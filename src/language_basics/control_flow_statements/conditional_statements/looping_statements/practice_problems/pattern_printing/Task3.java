package src.language_basics.control_flow_statements.conditional_statements.looping_statements.practice_problems.pattern_printing;

/**
 * Print the following pattern:
 * 
 * * - - - - - - - *
 * * * - - - - - * *
 * * * * - - - * * *
 * * * * * - * * * *
 * * * * * * * * * *
 * 
 */

public class Task3 {

    public static void main(String[] args) {
        int noOfRows = 5;
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j <= noOfRows * 2 - 1; j++) {
                if (j <= i || j >= ((noOfRows * 2) - i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
