package src.language_basics.control_flow_statements.conditional_statements.decision_making_statements.if_statement;

public class MultipleIfDemo {
    public static void main(String[] args) {
        int totalMarks = 73;

        if (totalMarks >= 90) {
            System.out.println("Grade A");
        }

        if (totalMarks >= 80 && totalMarks < 90) {
            System.out.println("Grade B");
        }

        if (totalMarks >= 70 && totalMarks < 80) {
            System.out.println("Grade C");
        }

        if (totalMarks >= 60 && totalMarks < 70) {
            System.out.println("Grade D");
        }

        if (totalMarks < 60) {
            System.out.println("Grade F");
        }
    }
}
