package src.language_basics.io.input;

import java.util.Scanner;

public class OtherFormatsInputDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter your house no.: ");
        int houseNo = Integer.parseInt(sc.nextLine());

        System.out.print("Enter your bank balance: ");
        double bankBalance = sc.nextDouble();

        System.out.println("\nDisplaying the details::");
        System.out.println("AGE: " + age);
        System.out.println("HOUSE NO.: " + houseNo);
        System.out.println("BANK BALANCE: " + bankBalance);

        sc.close();
    }

}
