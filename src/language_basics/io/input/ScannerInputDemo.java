package src.language_basics.io.input;

import java.util.Scanner;

public class ScannerInputDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Prompt:: Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Welcome, " + name);

        sc.close();
    }

}
