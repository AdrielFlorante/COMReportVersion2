import java.io.FileNotFoundException;

public class COMReportVersion2 {

    public static void main(String[] Args) throws FileNotFoundException {

        // Initializes blockSectionDA which initializes all the other objects
        BlockSectionDA blockSectionDA = new BlockSectionDA();

        for (BlockSection blockSection : blockSectionDA.getBlockSectionList()) {

            // Do more stuff here
            System.out.println("\n\nBlock section code: " + blockSection.getBlockCode() +
                    "\nDescription: " + blockSection.getDescription() +
                    "\nAdviser: " + blockSection.getAdviser() +
                    "\n\nTotal Students: " + blockSection.getTotalStudents() // Don't forget to setTotalStudents
            );

            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());

            for (Student student : studentDA.getStudentList()) {
                System.out.println("\nStudent number: " + student.getStudentNum() +
                        "\nStudent name: " + student.getName() +
                        "\nProgram: " + student.getProgram() +
                        "\nTotal units enrolled: " + student.getTotalUnitsEnrolled() // Don't forget to set the units
                );

                // Create a new instance of CourseDA for each student
                CourseDA courseDA = new CourseDA(student.getStudentNum());

                System.out.println("\nCourse code\tDescription\t\tUnits\tDay\tTime");

                for (Course course : courseDA.getCourseList()) {
                    System.out.println(course.getCourseCode() + "\t" + course.getDescription() + "\t" + course.getUnits() + "\t" + course.getDay() + "\t" + course.getTime());
                }

            }

        }

    }

}
