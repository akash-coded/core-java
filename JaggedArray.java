public class JaggedArray {
    public static void main(String[] args) {
        int[][] array = new int[3][]; // declaration

        // instantiation
        array[0] = new int[4];
        array[1] = new int[2];
        array[2] = new int[3];

        // initialization
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count++;
            }
        }

        // traversing using foreach loop
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
