package src.language_basics.control_flow_statements.unconditional_statements.branching_statements;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("After the loop...");
    }
}
