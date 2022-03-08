package src.serialization;

import java.io.*;

class DeserializationDemo {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fin = new FileInputStream("src/serialization/student_record.txt");
                ObjectInputStream in = new ObjectInputStream(fin);) {

            src.serialization.Student s = (src.serialization.Student) in.readObject();
            // printing the data of the serialized object
            System.out.println(s.rollNumber + " " + s.name);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
