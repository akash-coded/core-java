package src.language_basics.operators.unary_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        // declare variables
        int a = 12, b = 12;
        int incrementResult1, incrementResult2, decrementResult1, decrementResult2;

        // original value of a
        System.out.println("Value of a: " + a);

        // + (unary plus) operator
        System.out.println(+a);

        // - (unary minus) operator
        System.out.println(-a);

        // ! (logical complement) operator
        System.out.println(!true);

        /**
         * ++ (Increment) Operator
         */
        // prefix increment operator
        incrementResult1 = ++a; // a = a + 1 (immediate increment)
        System.out.println("After pre-increment: " + incrementResult1);
        System.out.println("Value of a after pre-increment: " + a);

        // postfix increment operator
        incrementResult2 = a++; // a = a + 1 (deferred increment)
        System.out.println("After post-increment: " + incrementResult2);
        System.out.println("Value of a after post-increment: " + a);

        /**
         * -- (Decrement) Operator
         */
        // prefix decrement operator
        decrementResult1 = --b; // b = b - 1 (immediate decrement)
        System.out.println("After pre-decrement: " + decrementResult1);
        System.out.println("Value of b after pre-decrement: " + b);

        // postfix decrement operator
        decrementResult2 = b--; // b = b - 1 (deferred decrement)
        System.out.println("After post-decrement: " + decrementResult2);
        System.out.println("Value of b after post-decrement: " + b);
    }

}
