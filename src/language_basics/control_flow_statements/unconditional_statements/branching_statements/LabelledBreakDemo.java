package src.language_basics.control_flow_statements.unconditional_statements.branching_statements;

public class LabelledBreakDemo {

    public static void main(String[] args) {
        int x = 0;
        outer: for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (++x == 19) {
                    break outer;
                }

                System.out.println(x);
            }
        }
    }

}
