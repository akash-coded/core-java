package src.language_basics.methods;

class DisplayName {
    String firstName = "Akash";

    public void printName() {
        // method local variable
        String lastName = "Das";
        System.out.println(firstName + " " + lastName);
    }
}

// Driver class
public class MethodDemo {

    public static void main(String[] args) {
        // create an instance of DisplayName
        DisplayName obj = new DisplayName();

        // method
        obj.printName();
    }

}
