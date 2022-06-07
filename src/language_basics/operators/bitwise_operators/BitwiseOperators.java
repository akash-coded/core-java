package src.language_basics.operators.bitwise_operators;

public class BitwiseOperators {

    public static void main(String[] args) {
        // declare variables
        int number1 = 5, number2 = 6;

        // | (bitwise OR) operator
        System.out.println(number1 | number2);

        // & (bitwise AND) operator
        System.out.println(number1 & number2);

        // ^ (bitwise XOR) operator
        System.out.println(number1 ^ number2);

        // ~ (bitwise complement) operator
        System.out.println(~number1);

        /**
         * Bitwise Shift Operators
         */
        int num1 = 2, num2 = 8, num3 = -8;

        // << (signed left shift) operator
        System.out.println(num1 << 1); // 1-bit signed left shift operation
        System.out.println(num1 << 2); // 2-bit signed left shift operation

        // >> (signed right shift) operator
        System.out.println(num2 >> 1); // 1-bit signed right shift operation
        System.out.println(num2 >> 2); // 2-bit signed right shift operation

        // >>> (unsigned right shift) operator
        System.out.println(num3 >>> 1); // 1-bit unsigned right shift operation
        System.out.println(num3 >>> 2); // 2-bit unsigned right shift operation
    }

}
