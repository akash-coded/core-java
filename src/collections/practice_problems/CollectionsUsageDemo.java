package src.collections.practice_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int id;
    private String subject;

    double percentage;

    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return name + "-" + id + "-" + subject + "-" + percentage;
    }
}

public class CollectionsUsageDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Dinesh", 1, "Algorithms", 75);
        Student student2 = new Student("Arnav", 2, "Automata", 55);
        Student student3 = new Student("Anamika", 3, "Databases", 80);
        Student student4 = new Student("Vishal", 4, "Networking", 40);

        // Create a list of students
        List<Student> studentList = new ArrayList<>(
                Arrays.asList(student1, student2, student3, student4));

        // Java 8 code to partition the students who got above 60% from those who
        // didn’t
        Map<Boolean, List<Student>> studentspartionedByPercentage = studentList.stream()
                .collect(Collectors.partitioningBy(student -> student.getPercentage() > 60.0));
        System.out.println(studentspartionedByPercentage);
        System.out.println();

        // Java 8 code to get the names of top 3 performing students
        List<Student> top3Students = studentList.stream()
                .sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3)
                .collect(Collectors.toList());
        System.out.println(top3Students);
        System.out.println();

        // Get the name and percentage of each student
        Map<String, Double> namePercentageMap = studentList.stream()
                .collect(Collectors.toMap(Student::getName, Student::getPercentage));
        System.out.println(namePercentageMap);
        System.out.println();

        // Get the subjects offered in the college
        Set<String> subjects = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
        System.out.println(subjects);
        System.out.println();

        // Java 8 code to get highest, lowest and average percentage of students?
        DoubleSummaryStatistics studentStats = studentList.stream()
                .collect(Collectors.summarizingDouble(Student::getPercentage));
        System.out.println("Highest Percentage: " + studentStats.getMax());
        System.out.println("Lowest Percentage: " + studentStats.getMin());
        System.out.println("Average Percentage: " + studentStats.getAverage());
        System.out.println();

        // Get total number of students from the given list of students
        Long studentCount = studentList.stream().collect(Collectors.counting());
        System.out.println(studentCount);
        System.out.println();

        // Get the students grouped by subject from the given list of
        // students.
        Map<String, List<Student>> studentsGroupedBySubject = studentList.stream()
                .collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(studentsGroupedBySubject);
        System.out.println();
    }
}
