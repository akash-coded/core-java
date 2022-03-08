package src.file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        // Create or Overwrite a file
        FileWriter writer = new FileWriter("src/file_handling/Test3.txt");
        writer.write("This is my 2nd file handling test file.");
        writer.write("Dummy text.");
        writer.close();
        System.out.println("File written successfully");

        // Append to a file
        FileWriter writer2 = new FileWriter("src/file_handling/Test3.txt", true);
        writer2.write("\nAppended via FileWriter");
        writer2.close();
        System.out.println("File appended successfully");

        // Java 7 onwards
        Files.write(Paths.get("src/file_handling/Test2.txt"), "Appended via nio.Files".getBytes(),
                StandardOpenOption.WRITE);
    }
}