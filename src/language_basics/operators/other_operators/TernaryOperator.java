package src.language_basics.operators.other_operators;

public class TernaryOperator {

    public static void main(String[] args) {
        int februaryDaysThisYear = 29;
        String yearType;

        // ?:(ternary) operator
        yearType = (februaryDaysThisYear == 28) ? "Not a leap year" : "Leap year";
        System.out.println(yearType);
    }

}
