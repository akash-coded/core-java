package src.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    // The default serialVersionUID. Else a generated one would have been inserted.
    private static final long serialVersionUID = 1L;

    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
}