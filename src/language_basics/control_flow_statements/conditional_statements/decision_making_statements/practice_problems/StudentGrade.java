package src.language_basics.control_flow_statements.conditional_statements.decision_making_statements.practice_problems;

public class StudentGrade {
    public static void main(String[] args) {
        int percentage = 6;

        if (percentage >= 90) {
            System.out.println("Grade-A");
        } else if (percentage >= 80) {
            System.out.println("Grade-B");
        } else if (percentage >= 70) {
            System.out.println("Grade-C");
        } else if (percentage >= 60) {
            System.out.println("Grade-D");
        } else {
            System.out.println("Grade-F");
        }
    }
}
