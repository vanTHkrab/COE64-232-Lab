package test.B;

public class Student {
    private String studentID;
    private String name;
    private Login login;

    public Student(String studentID, String name, Login login) {
        this.studentID = studentID;
        this.name = name;
        this.login = login;
    }

    public String getStudentID() {
        return studentID;
    }

    public Login getLogin() {
        return login;
    }

    public String toString() {
        return "Student ID: " + studentID + "\nName: " + name + "\n" + login.toString();
    }
}
