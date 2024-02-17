import java.util.List;

public class Student {
    private String studentNumber;
    private String name;
    private String program;
    private int totalUnitsEnrolled;
    private List<Course> courseList;
    private List<Student> studentList;


    //setter methods
    public void setStudentNum(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setTotalUnitsEnrolled(int totalUnitsEnrolled) {
        this.totalUnitsEnrolled = totalUnitsEnrolled;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }


    //getter methods
    public String getStudentNum() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public int getTotalUnitsEnrolled() {
        return totalUnitsEnrolled;
    }

    public List<Student> setStudentList() {
        return studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }
    
}