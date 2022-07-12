package src.language_basics.methods;

class ABC {

    public void sum(int x, int y) {
        System.out.println(x + y);
    }

}

public class ParameterisedMethodDemo {
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.sum(10, 20);
    }
}
