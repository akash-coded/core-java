package src.reflection.field_reflection;

import java.lang.Class;
import java.lang.reflect.*;

class Cat {
    private String color;
}

public class PrivateFieldReflection {
    public static void main(String[] args) {
        try {
            // create an object of Cat
            Cat d1 = new Cat();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // access the private field color
            Field field1 = obj.getDeclaredField("color");

            // allow modification of the private field
            field1.setAccessible(true);

            // set the value of color
            field1.set(d1, "brown");

            // get the value of field color
            String colorValue = (String) field1.get(d1);
            System.out.println("Value: " + colorValue);

            // get the access modifier of color
            int mod2 = field1.getModifiers();

            // convert the access modifier to string
            String modifier2 = Modifier.toString(mod2);
            System.out.println("Modifier: " + modifier2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
