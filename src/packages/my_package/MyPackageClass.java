package src.packages.my_package;

public class MyPackageClass {
    public void displayMessage() {
        System.out.println("Message from " + this.getClass());
    }

    public static void main(String[] args) {
        System.out.println("This is inside my package!");
    }
}
