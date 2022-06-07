package src.language_basics.data_types.primitive_types;

public class PrimitiveTypesDemo {

    public static void main(String[] args) {
        boolean b = true;
        System.out.println("Value of Boolean is: " + b);

        char ch = 'D';
        System.out.println("\nValue of character is: " + ch);

        byte bt = 126;
        // This will create compiler error as byte value
        // out of range
        // byte bbt=547;
        System.out.println("\nValue of Byte is: " + bt);
        // System.out.println("\nValue of 2nd Byte is: "+bbt);

        short sh = 4532;
        System.out.println("\nValue of short is: " + sh);

        int n = 532143;
        System.out.println("\nValue of Int is: " + n);

        long ln = 36536732659536L;
        System.out.println("\nValue of Long is: " + ln);

        float f = 54.65f;
        System.out.println("\nValue of float is: " + f);

        double d = 996.6655;
        System.out.println("\nValue of Double is: " + d);
    }
}
