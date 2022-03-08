package src.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// ****************************************************************************
// Warning.java
//
// Reads student data from a text file and writes data to another text file.
// ****************************************************************************

public class StudentsWarningTask {
    // --------------------------------------------------------------------
    // Reads student data (name, semester hours, quality points) from a
    // text file, computes the GPA, then writes data to another file
    // if the student is placed on academic warning.
    // --------------------------------------------------------------------
    static boolean defaulters(double gpa, int creditHrs) {
        return ((creditHrs < 30 && gpa < 1.5) || (creditHrs < 60 && gpa < 1.75) || (gpa < 2.0));
    }

    public static void main(String[] args) {
        int creditHrs; // number of semester hours earned
        double qualityPts; // number of quality points earned
        double gpa; // grade point (quality point) average
        String name;
        String inputName = "students.dat";

        String outputName = "warning.dat";

        try {
            File f = new File(inputName);
            Scanner s = new Scanner(f);
            FileWriter fw = new FileWriter(outputName);
            while (s.hasNextLine()) {
                String[] arg = s.nextLine().split("\\s");
                name = arg[0];
                creditHrs = Integer.parseInt(arg[1]);
                qualityPts = Double.parseDouble(arg[2]);
                gpa = qualityPts / creditHrs;
                if (defaulters(gpa, creditHrs)) {
                    fw.write(name + " " + creditHrs + " " + qualityPts + "\n");
                }
            }
            fw.close();
            // Close output file
        } catch (FileNotFoundException exception) {
            System.out.println("The file " + inputName + " was not found.");
        } catch (IOException exception) {
            System.out.println(exception);
        } catch (NumberFormatException e) {
            System.out.println("Format error in input file: " + e);
        }
    }
}