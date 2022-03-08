package src.file_handling;

import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("src/file_handling/Test.txt");
        if (f.delete()) {
            System.out.println(f.getName() + " deleted.");
        } else {
            System.out.println("Unexpected error encountered while trying to delete " + f.getName());
        }

        try {
            Files.deleteIfExists(Paths.get("Empty"));
            System.out.println("Deleted successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (NoSuchFileException e) {
            System.out.println("Sorry, file not found!");
        } catch (DirectoryNotEmptyException e) {
            System.out.println("Directory not empty");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
