package Object.Lab10_1;

public class Course {
    private String courseID;
    private int unit;
    private String grade;

    public Course() {
    }

    public Course(String c, int u, String g) {
        this.courseID = c;
        this.unit = u;
        this.grade = g;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getUnit() {
        return unit;
    }

    public String getGrade() {
        return grade;
    }

    public String toString() {
        return courseID + "    " + unit + "     " + grade;
    }

    public void setGrade(String g) {
        this.grade = g;
    }
}
