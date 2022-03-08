package src.file_handling;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File f = new File("src/file_handling/Test3.txt");

        if (f.exists()) {
            System.out.println(f.getName());

            System.out.println(f.getAbsolutePath());

            System.out.println(f.canRead());

            System.out.println(f.canWrite());

            System.out.println(f.canExecute());

            System.out.println(f.length());
        } else {
            System.out.println("The file does not exist");
        }
    }
}
