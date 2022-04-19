package src.exception_handling;

import java.io.*;

public class TryWithResources {
    // public static void main(String[] args) {
    // BufferedReader br = null;
    // System.out.println("Before opening the resource");
    // try {
    // br = new BufferedReader(new FileReader("exception_handling/text.txt"));
    // System.out.println(br.readLine());
    // // br.close();
    // } catch (IOException e) {
    // System.out.println("Some error occurred while reading from the file " + e);
    // } finally {
    // try {
    // br.close();
    // } catch (NullPointerException | IOException e) {
    // System.out.println("Error while closing file resource");
    // }
    // }
    // }

    public static void main(String[] args) {
        System.out.println("Before opening the resource");
        try (BufferedReader br = new BufferedReader(new FileReader("src/exception_handling/text.txt"));) {
            System.out.println(br.readLine());
            // Accessing out of bounds index
            // int[] arr = { 1 };
            // System.out.println(arr[3]);
        } catch (NullPointerException | IOException e) {
            System.out.println("Error while closing file resource");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error in accessing array index value");
        } finally {
            System.out.println("Finally block");
        }
    }
}
