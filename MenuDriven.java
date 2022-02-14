import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one of the given options[1-3]::");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("You have chosen addition");
                break;
            case 2:
                System.out.println("You have chosen subtraction");
                break;
            case 3:
                System.out.println("You have chosen to exit. Goodbye!");
                break;
            default:
                System.out.println("Invalid option. Goodbye!");
                break;
        }
    }
}
