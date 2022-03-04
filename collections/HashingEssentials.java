package collections;

class MyClass {
    private final String importantField;
    private final String anotherField;

    public MyClass(final String equalField, final String anotherField) {
        this.importantField = equalField;
        this.anotherField = anotherField;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((importantField == null) ? 0 : importantField.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final MyClass other = (MyClass) obj;
        if (importantField == null) {
            if (other.importantField != null)
                return false;
        } else if (!importantField.equals(other.importantField)) {
            return false;
        }
        return true;
    }
}

public class HashingEssentials {
    public static void main(String[] args) {
        // when two objects are equal
        MyClass first = new MyClass("a", "first");
        MyClass second = new MyClass("a", "second");

        System.out.println(first.hashCode());
        System.out.println(second.hashCode());

        System.out.println(first.equals(second));

        // when two objects are not equal
        MyClass third = new MyClass("c", "third");
        MyClass fourth = new MyClass("d", "fourth");

        System.out.println(third.hashCode());
        System.out.println(fourth.hashCode());

        System.out.println(third.equals(fourth));
    }
}
