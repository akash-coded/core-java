package src.language_basics.control_flow_statements.conditional_statements.decision_making_statements.if_else_statement;

public class IfElseStatementDemo {
    public static void main(String[] args) {
        boolean result = 5 < 3;

        if (result) {
            System.out.println("Inside the if-block...");
        } else {
            System.out.println("Inside the else block...");
        }
    }
}
