package src.language_basics.control_flow_statements.unconditional_statements.branching_statements;

public class BreakDemo {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("After the loop...");
    }

}
