package src.reflection;

import java.lang.Class;
import java.lang.reflect.*;

class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // create an object of Dog
            Dog d1 = new Dog();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // get FQN of the class
            String name = obj.getName();
            System.out.println("FQN: " + name);

            // get simple name of the class
            String simpleName = obj.getSimpleName();
            System.out.println("Simple Name: " + simpleName);

            // get the access modifier of the class
            int modifier = obj.getModifiers();

            // convert the access modifier to string
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            // get the superclass of Dog
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass FQN: " + superClass.getName());
            System.out.println("Superclass Simple Name: " + superClass.getSimpleName());
            System.out.println("Superclass Modifier: " + Modifier.toString(superClass.getModifiers()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}