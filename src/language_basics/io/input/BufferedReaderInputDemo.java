package src.language_basics.io.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderInputDemo {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Prompt:: Enter your name: ");
        String name = br.readLine();

        System.out.println("Welcome, " + name);
    }

}
