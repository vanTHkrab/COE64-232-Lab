package Object.Lab13;

public class Student {
    private String studentID;
    private String name;
    private Login login;

    public Student(String studentID, String name, String username, String password) {
        this.studentID = studentID;
        this.name = name;
        this.login = new Login(username, password);
    }

    public String getStudentID() {
        return this.studentID;
    }

    public Login getLogin() {
        return login;
    }

    public String toString() {
        return "ID: " + this.studentID + " Name: " + this.name + "\n" + this.login.toString();
    }
}
