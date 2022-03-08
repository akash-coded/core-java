package src.language_basics.arrays;

public class ArrayMergingDemo {
    public static int[] mergeSortedarrays(int[] a, int[] b) {
        int[] m = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                m[k++] = a[i++];
            else
                m[k++] = b[j++];
        }

        while (i < a.length)
            m[k++] = a[i++];

        while (j < b.length)
            m[k++] = b[j++];

        return m;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 9 };
        int[] b = { 2, 4, 6, 8, 10, 12, 14 };
        System.out.println("Sorted merger array is:");
        int[] c = mergeSortedarrays(a, b);
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + ", ");
    }

}
