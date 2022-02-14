public class DigitExtraction {
    public static void main(String[] args) {
        int num = 741;

        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            System.out.println(digit);
        }
    }
}
