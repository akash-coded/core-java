import java.lang.reflect.*;

class ParentClass {
    public void belongsToParentClass() {
        System.out.println("Unique to ParentClass class");
    }

    public void method() {
        System.out.println("In ParentClass");
    }
}

class ChildClass extends ParentClass {
    public void belongsToChildClass() {
        System.out.println("Unique to ChildClass class");
    }

    @Override
    public void method() {
        System.out.println("In ChildClass");
    }
}

public class DynamicPolymorphism {
    public static void main(String... args) {
        ParentClass a = new ParentClass();
        ParentClass b = new ChildClass();

        a.method();
        b.method(); // Dynamic method dispatch

        a.belongsToParentClass();
        b.belongsToParentClass();
        // b.belongsToChildClass();

        ChildClass obj = (ChildClass) b;
        // b.belongsToChildClass();

        int x = 5;
        double y = x;
        int z = (int) y;
    }
}
