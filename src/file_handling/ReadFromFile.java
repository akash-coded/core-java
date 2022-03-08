package src.file_handling;

import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        // the general way
        File f = new File("src/file_handling/Test3.txt");

        try (Scanner fileReader = new Scanner(f);) { // try-with-resources
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // nio way of reading from file
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/file_handling/Test2.txt"))) {
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null) {// while there is content on the current line
                System.out.println(currentLine); // print the current line
            }
        } catch (IOException ex) {
            ex.printStackTrace(); // handle an exception here
        }

        // using FileReader (reads character by character)
        try (FileReader fileReader = new FileReader("src/file_handling/Test3.txt");) {
            int ch;
            int counter = 0;
            while ((ch = fileReader.read()) != -1) {
                System.out.println((char) ch);
                counter++;
            }
            System.out.println(counter);
        } catch (IOException ex) {
            ex.printStackTrace(); // handle an exception here
        }
    }
}
