package src.language_basics.arrays;

import java.lang.reflect.Array;

public class SingleDimensionalArrays {
    public static void example1() {
        int[] array; // declaration
        array = new int[5]; // instantiation

        // initialization
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        // accessing
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void example2() {
        int[] array = { 10, 20, 30, 40, 50 }; // declaration, instantiation and initialization

        // traversing
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void example3() {
        int[] array = { 10, 20, 30, 40, 50 }; // declaration, instantiation and initialization

        // using foreach loop to traverse an array
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void example4(int[] arr) {
        arr[0] = -1;

        // using foreach loop to traverse an array
        for (int element : arr) {
            System.out.println(element);
        }
    }

    public static int[] example5() {
        int[] array = { 10, 20, 30, 40, 50 }; // declaration, instantiation and initialization

        array[2] = -2;

        return array;
    }

    public static void main(String[] args) {
        example1();
        // example2();
        // example3();
        // example4(new int[] { 10, 20, 30, 40, 50 }); // anonymous array
        // int[] array = example5();
        // using foreach loop to traverse an array
        // for (int element : array) {
        // System.out.println(element);
        // }
    }
}
