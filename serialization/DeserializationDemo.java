package serialization;

import java.io.*;

class DeserializationDemo {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fin = new FileInputStream("serialization/student_record.txt");
                ObjectInputStream in = new ObjectInputStream(fin);) {

            serialization.Student s = (serialization.Student) in.readObject();
            // printing the data of the serialized object
            System.out.println(s.rollNumber + " " + s.name);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
