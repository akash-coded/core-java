package src.serialization;

import java.io.*;

class SerializationDemo {
    public static void main(String... args) {
        try (FileOutputStream fout = new FileOutputStream("src/serialization/student_record.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);) {
            // Creating the object
            src.serialization.Student s1 = new src.serialization.Student(21, "Akash");
            // Write the object into the file
            out.writeObject(s1);
            // Flush the output stream pipe
            out.flush();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("failure");
            System.out.println(e);
        }
    }
}