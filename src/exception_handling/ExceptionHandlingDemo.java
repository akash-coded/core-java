package src.exception_handling;

import java.io.IOException;

class ExceptionDemo {
    void print5thElement(int[] arr) {
        // throw new IOException(); // exception object created manually

        System.out.println(arr[4]); // uncaught exception

        // if (arr.length >= 5) {
        // System.out.println(arr[4]);
        // } else {
        // System.out.println("Sorry! Array index out of bounds");
        // }

        // try {
        // System.out.println(arr[4]); // uncaught exception
        // } catch (ArithmeticException e) {
        // System.out.println("Sorry! Array index out of bounds");
        // }

        // try {
        // System.out.println(arr[4]);
        // } catch (Exception e) { // caught exception
        // System.out.println("Sorry! Array index out of bounds");
        // }
    }

    void divideTwoNumbers(int a, int b) {
        System.out.println(a / b); // exception object is created by JVM
    }
}

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30 };

        ExceptionDemo exceptionDemo = new ExceptionDemo();

        try {
            array[10] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            exceptionDemo.print5thElement(array);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside catch");
        } finally {
            System.out.println("Inside finally");
        }

        System.out.println("After try-catch");

        exceptionDemo.divideTwoNumbers(6, 2);
    }
}
