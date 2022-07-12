package src.language_basics.control_flow_statements.conditional_statements.looping_statements.exit_controlled_loops;

import java.util.Scanner;

/**
 * Menu-driven program example with do-while, switch-case, and labelled break
 */
public class MenuDrivenProgramDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueChoice;

        System.out.println("Welcome to ATM Machine...");

        loop: do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Quit");
            System.out.print("Enter Choice[1-4]: ");

            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Amount deposited into the account");
                    break;
                case 2:
                    System.out.println("Amount withdrawn from the account");
                    break;
                case 3:
                    System.out.println("Current account balance is Rs. XXX");
                    break;
                case 4:
                    break loop; // this will break directly out of thr do-while loop
                default:
                    System.out.println("Invalid input. Please try again...");
                    break;
            }

            System.out.print("Do you want to continue? [Y/N]: ");
            continueChoice = sc.next(); // sentinel
        } while (continueChoice.equalsIgnoreCase("Y"));

        System.out.println("Thank you for visiting.");
        sc.close();
    } // main method ends

} // class ends
