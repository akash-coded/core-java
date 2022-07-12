package src.language_basics.control_flow_statements.conditional_statements.decision_making_statements.if_else_if_ladder;

public class IfElseIfDemo {
    public static void main(String[] args) {
        int totalMarks = 73;

        if (totalMarks >= 90) {
            System.out.println("Grade A");
        } else if (totalMarks >= 80) {
            System.out.println("Grade B");
        } else if (totalMarks >= 70) {
            System.out.println("Grade C");
        } else if (totalMarks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}
