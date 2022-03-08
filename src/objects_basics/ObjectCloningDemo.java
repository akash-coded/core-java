package src.objects_basics;

class Dependency {
    int data = 3;

    @Override
    public String toString() {
        return "Dependency [data=" + data + "]";
    }
}

class CloneableClass implements Cloneable {
    int version;
    Dependency testObj; // dependency

    public CloneableClass(int version, Dependency testObj) {
        this.version = version;
        this.testObj = testObj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Dependency newDependencyObj = new Dependency();
        CloneableClass clonedObj = new CloneableClass(this.version, newDependencyObj);
        return clonedObj;
    }
}

public class ObjectCloningDemo {
    public static void main(String[] args) throws Exception {
        CloneableClass originalObj = new CloneableClass(11, new Dependency());
        CloneableClass clonedObj = (CloneableClass) originalObj.clone();

        System.out.println("Objects before change::");
        System.out.println("Original:" + originalObj.version + "\t" + originalObj.testObj);
        System.out.println("Clone:" + clonedObj.version + "\t" + clonedObj.testObj);
        System.out.println();

        clonedObj.version = 12;
        clonedObj.testObj.data = 4;

        System.out.println("Objects after change::");
        System.out.println("Original:" + originalObj.version + "\t" + originalObj.testObj);
        System.out.println("Clone:" + clonedObj.version + "\t" + clonedObj.testObj);
    }
}
