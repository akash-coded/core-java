package src.classes_and_objects.initializer_blocks;

class StaticInitializerBlockDemo {
    final int x;
    static final int y;

    StaticInitializerBlockDemo(int x) {
        this.x = x; // initialized
    }

    /**
     * Static Initializer Block
     */
    static {
        System.out.println("Static Initializer Block");
        y = 6; // initialized
    }

    @Override
    public String toString() {
        return "StaticInitializerBlockDemo [x=" + x + "]" + "[y=" + y + "]";
    }
}

// static initializer block -> main() -> StaticBlockDemo costructor() -> other
// activities

class InstanceInitializerBlockDemo {
    final int x;

    InstanceInitializerBlockDemo(int x) {
        System.out.println("Constructor invoked");
        this.x = x; // initialized
    }

    /**
     * Instance intializer block
     */
    {
        System.out.println("Instance intializer block invoked");
    }

    /**
     * Static initializer block
     */
    static {
        System.out.println("Static intializer block executed");
        staticFun();
        // InstanceInitializerBlockDemo obj = new InstanceInitializerBlockDemo(5);
        // obj.nonStaticFun();
    }

    static void staticFun() {
        System.out.println("Static function invoked");
    }

    void nonStaticFun() {
        System.out.println("Non-static function invoked");
    }

    @Override
    public String toString() {
        return "InstanceInitializerBlockDemo [x=" + x + "]";
    }
}

// static initializer block -> static functions invoked by static block ->
// instance initializer block ->
// InstanceInitializerBlockDemo costructor() -> other

public class InitializerBlocks {
    public static void main(String[] args) {
        System.out.println("Inside main method");

        InstanceInitializerBlockDemo obj = new InstanceInitializerBlockDemo(5);
        System.out.println(obj);

        System.out.println(StaticInitializerBlockDemo.y);
        StaticInitializerBlockDemo obj1 = new StaticInitializerBlockDemo(5);
        System.out.println(obj1);
    }
}
