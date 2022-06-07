package src.language_basics.operators.assignment_operators;

public class AssignmentOperators {

    public static void main(String[] args) {

        // create variables
        int a = 4;
        int var;

        // assign value using =
        var = a;
        System.out.println("value assigned to var using =: " + var);

        /**
         * Compound Assignment Operators
         */
        // assign value using +=
        var += 2; // var = var + 2
        System.out.println("value assigned to var using +=: " + var);

        // assign value using *=
        var *= 2; // var = var * 2
        System.out.println("value assigned to var using *=: " + var);

    }

}
