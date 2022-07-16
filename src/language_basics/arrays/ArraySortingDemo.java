package src.language_basics.arrays;

public class ArraySortingDemo {

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; ++i) {
            for (int j = 0; j < len - i - 1; ++j) {
                if (arr[j + 1] < arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] array = { 12, 7, 5, 15, 17 };
        bubbleSort(array);

        for (int ele : array) {
            System.out.print(ele + ", ");
        }
    }
}
