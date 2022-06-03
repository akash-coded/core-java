package src.language_basics.control_flow_statements.conditional_statements.decision_making_statements.switch_case;

enum Status {
    OPEN, WIP, REVIEW, FIX, CLOSED;
}

class StandardSwitchDemo {

    private StandardSwitchDemo() {
        throw new IllegalStateException("Utility class");
    }

    public static void printNumberOfLetters() {
        int numberOfLetters = -1;

        Status status = Status.CLOSED;

        if (status == null) {
            System.out.println("Status null!");
        } else {
            switch (status) {
                case WIP:
                case FIX:
                    numberOfLetters = 3;
                    break;

                case OPEN:
                    numberOfLetters = 4;
                    break;

                case CLOSED:
                case REVIEW:
                    numberOfLetters = 6;
                    break;

                default:
                    throw new IllegalStateException("Invalid status: " + status);
            }
        }
        System.out.println(numberOfLetters);
    }

}

class PatternMatchingSwitchDemo {

    private PatternMatchingSwitchDemo() {
        throw new IllegalStateException("Utility class");
    }

    public static void printNumberOfLetters() {
        Status status = Status.OPEN;

        System.out.println(
                switch (status) { // switch expression
                    // case null -> System.out.println("Status null!");
                    case WIP, FIX -> 3; // arrow case labels
                    case OPEN -> 4;
                    case CLOSED, REVIEW -> 6;
                    default -> throw new IllegalStateException("Invalid status: " + status);
                });
    }

}

public class SwitchPatternMatching {
    public static void main(String[] args) {
        System.out.println("Demonstrating standard switch-case:: ");
        StandardSwitchDemo.printNumberOfLetters();
        System.out.println();

        System.out.println(
                "Demonstrating modern switch-case with switch expression, arrow case labels, and pattern matching:: ");
        PatternMatchingSwitchDemo.printNumberOfLetters();
        System.out.println();
    }
}
