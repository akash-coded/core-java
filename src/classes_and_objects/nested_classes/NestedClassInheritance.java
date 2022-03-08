package src.classes_and_objects.nested_classes;

class OuterClass {
    void outerFun() {
        System.out.println("Inside OuterClass function");
    }

    class InnerClass {
        void innerFun() {
            System.out.println("Inside InnerClass function");
        }
    }
}

class OuterClassChild extends OuterClass {

}

interface OuterInterface {
    void outerFun();

    class InnerClass2 {
        void innerFun() {
            System.out.println("Inside InnerClass function");
        }
    }
}

class OuterInterfaceChild implements OuterInterface {
    @Override
    public void outerFun() {
        System.out.println("Inside OuterInterfaceChild function");
    }
}

public class NestedClassInheritance {
    public static void main(String[] args) {
        OuterClassChild outerClassChild = new OuterClassChild();
        OuterClassChild.InnerClass inheritedInnerClass = outerClassChild.new InnerClass();

        OuterInterfaceChild objOuterChild = new OuterInterfaceChild();
        OuterInterfaceChild.InnerClass2 objChildClass2 = null;
    }
}
