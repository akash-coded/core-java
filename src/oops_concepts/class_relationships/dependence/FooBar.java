package src.oops_concepts.class_relationships.dependence;

class Foo {
    private String name;

    public Foo() {
    }

    public Foo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Foo [name=" + name + "]";
    }
}

class Bar {
    private String name;
    private int age;
    private Foo foo;

    public Bar() {
    }

    public Bar(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public void processFooName() {
        System.out.println("Name in injected Foo is: " + foo.getName());
    }

    @Override
    public String toString() {
        return "Bar [age=" + age + ", foo=" + foo + ", name=" + name + "]";
    }
}

public class FooBar {
    public static void main(String[] args) {
        Foo f = new Foo("Cleopatra");
        System.out.println(f);

        Bar b = new Bar("Arthur", 26);
        b.setFoo(f);
        System.out.println(b);
    }
}
