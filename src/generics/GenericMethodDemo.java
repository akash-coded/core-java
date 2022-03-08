package src.generics;

class RegularClass {
    int member;

    RegularClass(int member) {
        this.member = member;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    <T> void displayType(T param) {
        System.out.println("Generic function");
        System.out.println(param.getClass().getName());
    }

    void displayType(Integer param) {
        System.out.println("Integer function: " + param);
    }
}

public class GenericMethodDemo {
    public static void main(String[] args) {
        RegularClass regular = new RegularClass(5);

        regular.displayType("Hello"); // invokes generic function
        regular.displayType(10.5); // invokes generic function

        regular.displayType(10); // invokes regular function
    }
}
