package src.language_basics.arrays;

public class MultidimensionalArrays {
    public static void example1() {
        int[][] array; // declaration
        array = new int[2][3]; // instantiation

        // initialization
        array[0][0] = 10;
        array[0][1] = 20;
        array[0][2] = 30;
        array[1][0] = 100;
        array[1][1] = 101;
        array[1][2] = 102;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void example2() {
        int[][] array = { { 10, 20, 30 }, { 100, 101, 102 } }; // declaration, instantiation and initialization

        // using foreach loop to traverse a multi-dimensional array
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        example2();
    }
}
