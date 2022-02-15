class CloneDemo {
    int data = 3;

    @Override
    public String toString() {
        return "CloneDemo [data=" + data + "]";
    }
}

public class ObjectCloning implements Cloneable {
    int version;
    CloneDemo testObj; // dependency

    public ObjectCloning(int version, CloneDemo testObj) {
        this.version = version;
        this.testObj = testObj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneDemo newDependencyObj = new CloneDemo();
        ObjectCloning newObj = new ObjectCloning(this.version, newDependencyObj);
        return newObj;
    }

    public static void main(String[] args) throws Exception {

        ObjectCloning originalObj = new ObjectCloning(11, new CloneDemo());
        ObjectCloning clonedObj = (ObjectCloning) originalObj.clone();

        System.out.println("Initial values");
        System.out.println("Original:" + originalObj.version + "\t" + originalObj.testObj);
        System.out.println("Clone:" + clonedObj.version + "\t" + clonedObj.testObj);

        clonedObj.version = 12;
        clonedObj.testObj.data = 4;

        System.out.println("After the change");
        System.out.println("Original:" + originalObj.version + "\t" + originalObj.testObj);
        System.out.println("Clone:" + clonedObj.version + "\t" + clonedObj.testObj);
    }
}
