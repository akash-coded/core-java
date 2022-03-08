package src.classes_and_objects.initializer_blocks;

class DemoParent {
    /**
     * IIB
     */
    {
        System.out.println("Parent instance initializer block invoked");
    }

    DemoParent() {
        System.out.println("Parent constructor invoked");
    }

    static {
        System.out.println("Parent static initializer block executed");
    }
}

class DemoChild extends DemoParent {
    /**
     * IIB-1
     */
    {
        System.out.println("Child instance initializer block-1 invoked");
    }

    /**
     * IIB-2
     */
    {
        System.out.println("Child instance initializer block-2 invoked");
    }

    DemoChild() {
        System.out.println("Child constructor invoked");
    }

    static {
        System.out.println("Child static initializer block executed");
    }
}

public class InitialzerBlocksWithInheritance {

    public static void main(String[] args) {
        System.out.println("Inside main() method");
        DemoChild child = new DemoChild();
    }

    static {
        System.out.println("Driver static initializer block-1 executed");
    }

    static {
        System.out.println("Driver static initializer block-2 executed");
    }
}
