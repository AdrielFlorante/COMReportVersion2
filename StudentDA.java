import java.util.*;
import java.io.*;

public class StudentDA {
    private List<Student> studentList;

    // Getter for studentList
    public List<Student> getStudentList() {
        return studentList;
    }

    // Constructor for StudentDA
    public StudentDA(String blockCode) throws FileNotFoundException {

        studentList = new ArrayList<>();

        Scanner blockSectionStudentFile = new Scanner(new FileReader("blockSection.csv"));

        // Go through blockSection.csv line by line to find the associated students with each block
        while (blockSectionStudentFile.hasNext()) {

            String blockSectionRaw = blockSectionStudentFile.nextLine();
            String[] blockSectionArray = new String[4];

            blockSectionArray = blockSectionRaw.split(",");

            // Open studentInfo.csv to add each student to their respective blocks
            if (blockSectionArray[0].trim().equals(blockCode)) {

                //CourseDA courseDA = new CourseDA(); // Move the instantiation inside the block

                Scanner studentFile = new Scanner(new FileReader("studentInfo.csv"));

                // Go through studentFile line by line and add students to the studentList of their respective blocks
                while (studentFile.hasNext()) {

                    String studentRaw = studentFile.nextLine();
                    String[] studentArray = new String[4];
                    studentArray = studentRaw.split(",");

                    if (blockSectionArray[0].trim().equals(studentArray[0].trim())) {
                        // Create student
                        Student student = new Student();

                        student.setStudentNum(studentArray[1]);
                        student.setName(studentArray[2]);
                        student.setProgram(studentArray[3]);

                        // Create courseDA
                        CourseDA courseDA = new CourseDA(student.getStudentNum());
                        student.setTotalUnitsEnrolled(courseDA.getCourseList().size());

                        studentList.add(student);

                        // Now that the student has been added, we should add courses to this specific student
                        // student.setCourseList(courseDA.getCourseList(student.getStudentNum()));
                    }

                }

                studentFile.close();
            }
        }

        blockSectionStudentFile.close();

    }

}