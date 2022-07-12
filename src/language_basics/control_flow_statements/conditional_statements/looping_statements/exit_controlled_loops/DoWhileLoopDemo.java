package src.language_basics.control_flow_statements.conditional_statements.looping_statements.exit_controlled_loops;

public class DoWhileLoopDemo {

    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.printf("5 X %d = %d%n", i, 5 * i);
            i++;
        } while (i <= 10);
    }

}
