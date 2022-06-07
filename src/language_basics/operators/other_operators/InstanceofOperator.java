package src.language_basics.operators.other_operators;

public class InstanceofOperator {

    public static void main(String[] args) {
        // create a variable of String type
        String courseName = "Core Java";

        // check if courseName is an instance of String
        boolean result1 = courseName instanceof String;
        System.out.println("Is courseName an object of String? " + result1);

        // create an object of InstanceofOperator
        InstanceofOperator obj = new InstanceofOperator();

        // check if obj is an instance of InstanceofOperator
        boolean result2 = obj instanceof InstanceofOperator;
        System.out.println("Is obj an object of InstanceofOperator class? " + result2);
    }

}
