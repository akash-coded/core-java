package src.language_basics.io.output;

public class OutputFormattingDemo {

    public static void main(String[] args) {
        System.out.println("Plain message");
        System.out.println("Message with data:: " + 10);
        System.out.println("Message with multiple data. Data1 = " + 10 + ", Data2 = " + 20);
        System.out.println();

        System.out.println(String.format("Message with data (using formatted string):: %d", 10));
        System.out.println(
                String.format("Message with multiple data. (using formatted string):: Data1 = %d, Data2 = %d", 10, 20));
        System.out.println();

        System.out.printf("Message with data (using printf()):: %d%n", 10);
        System.out.printf("Message with multiple data. (using printf()):: Data1 = %d, Data2 = %d", 10, 20);
    }

}
