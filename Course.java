public class Course {
    private String courseCode;
    private String description;
    private int unit;
    private String day;
    private String time;

    //setter methods
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnits(int unit) {
        this.unit = unit;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }


    //getter methods
    public String getCourseCode() {
        return courseCode;
    }

    public String getDescription() {
        return description;
    }

    public int getUnits() {
        return unit;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

}