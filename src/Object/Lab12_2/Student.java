package Object.Lab12_2;

public class Student {
    private String studentID;
    private String name;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public String toString() {
        return "Student ID: " + this.studentID + " Name: " + this.name;
    }
}
