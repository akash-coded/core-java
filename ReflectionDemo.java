import java.lang.Class;
import java.lang.reflect.*;

class JavaStudent {
}

class SpringStudent extends JavaStudent {
    public int rollNo = 10;

    public SpringStudent() {
    }

    public SpringStudent(String name, int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        JavaStudent student = new JavaStudent();
        Class cls = student.getClass();
        System.out.println(cls.getName());
        System.out.println(cls.getModifiers());

        Class supercls = cls.getSuperclass();
        System.out.println("Superclass: " + supercls.getName());
        System.out.println("Superclass: " + supercls.getSimpleName());

        SpringStudent springStudent = new SpringStudent();
        Class cls2 = springStudent.getClass();
        System.out.println(cls2.getName());

        Field field1 = cls2.getField("rollNo");
        System.out.println(field1.get(springStudent));
        field1.set(springStudent, 21);
        System.out.println(field1.get(springStudent));

        Constructor[] constructors = cls2.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println("Constructor name: " + c.getName());

            System.out.println("Constructor modifier: " + Modifier.toString(c.getModifiers()));

            System.out.println("Parameters: " + c.getParameterCount());
        }

        Method[] methods = cls2.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method name: " + m.getName());

            System.out.println("Method modifier: " + Modifier.toString(m.getModifiers()));

            System.out.println("Parameters: " + m.getParameterCount());

            System.out.println("Return Type: " + m.getReturnType());
        }
    }
}
