package test.B;

import java.util.ArrayList;

public class Major {
    private String name;
    private ArrayList<Student> s;

    public Major(String name, ArrayList<Student> s) {
        this.name = name;
        this.s = s;
    }

    public void addStudent(Student student) {
        s.add(student);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return s;
    }

    public void addStudents(ArrayList<Student> students) {
        s.addAll(students);
    }

    public void deleteStudent(Student student) {
        s.remove(student);
    }

    public String toString() {
        String result = "Major: " + name + "\n" + "Students: " + s.size() + "\n";
        for (Student student : s) {
            result += student.toString() + "\n";
        }
        return result;
    }

}
