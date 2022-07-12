package src.language_basics.control_flow_statements.conditional_statements.decision_making_statements.switch_case;

public class SwitchStatementDemo {

    public static void main(String[] args) {
        int number = 40;
        String size;

        // switch statement to check size
        switch (number) {
            case 40:
                size = "Small";
                break;
            case 42:
                size = "Medium";
                break;
            case 44:
                size = "Large";
                break;
            case 46:
                size = "Extra Large";
                break;
            default:
                size = "Unknown";
                break;
        }

        System.out.println("Size: " + size);
    }

}
