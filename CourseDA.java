import java.util.*;
import java.io.*;

public class CourseDA {
    private List<Course> courseList;

    public List<Course> getCourseList() {
        return courseList;
    }

    public CourseDA(String studentNum) throws FileNotFoundException {

        courseList = new ArrayList<>();

        Scanner courseFile = new Scanner(new FileReader("scheduleInfo.csv"));

        while (courseFile.hasNext()) {

            String courseFileRaw = courseFile.nextLine();
            String[] courseArray = new String[6];

            courseArray = courseFileRaw.split(",");

            // Always use trim when handling String data just in case
            if (courseArray[0].trim().equals(studentNum)) {
                // course --> create() --> courseDA
                Course course = new Course();

                course.setCourseCode(courseArray[1]);
                course.setDescription(courseArray[2]);
                course.setUnits(Integer.parseInt(courseArray[3]));
                course.setDay(courseArray[4]);
                course.setTime(courseArray[5]);

                courseList.add(course);
            }
            
        }

        courseFile.close();
        
    }
}