package src.language_basics.methods;

class DEF {

    public int sum(int x, int y) {
        return x + y;
    }

}

public class MethodWithReturnTypeDemo {
    public static void main(String[] args) {
        DEF obj = new DEF();
        int result = obj.sum(1, 2);
        System.out.println(result);

        System.out.println(obj.sum(1, 2));
    }
}
