package Object.Lab13;

import java.util.ArrayList;

public class Major {
    private String name;
    private ArrayList<Student> s;

    public Major(String n, ArrayList<Student> s) {
        this.name = n;
        this.s = s;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudent() {
        return s;
    }

    public void addStudent(Student s) {
        this.s.add(s);
    }

    public void deleteStudent(Student s) {
        this.s.remove(s);
    }

    public String toString() {
        int count = 0;
        String str = "Major " + this.name + ": " + s.size() + " Students\n";
        for (Student student : s) {
            str += ++count + ". " + student.toString() + "\n";
        }
        return str;
    }
}
