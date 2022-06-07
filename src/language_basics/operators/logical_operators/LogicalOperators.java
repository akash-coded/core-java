package src.language_basics.operators.logical_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        // create variables
        int a = 3, b = 5, c = 8;

        // && (logical AND) operator
        System.out.println((b > a) && (c > b)); // true && true = true
        System.out.println((b > a) && (c < b)); // true && false = false

        // || (logical OR) operator
        System.out.println((b < a) || (c > b)); // false || true = true
        System.out.println((b > a) || (c < b)); // true || false = true
        System.out.println((b < a) || (c < b)); // false || false = false

        // ! (inverter) operator
        System.out.println((a == b)); // false
        System.out.println(!(a == b)); // !false = true
        System.out.println(!(b > a)); // !true = false
    }

}
