package Object.Lab12_2;

import java.util.ArrayList;

public class Major {
    private String name;
    private ArrayList<Student> s;

    public Major(String name, ArrayList<Student> s) {
        this.name = name;
        this.s = s;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Student> getStudents() {
        return this.s;
    }

    public void addStudent(Student s) {
        this.s.add(s);
    }

    public void deleteStudent(int index) {
        this.s.remove(index);
    }

    public String toString() {
        String result = "Major " + this.name + ": " + s.size() + " Students\n";
        int i = 1;
        for(Student student : this.s) {
            result += i++ + ". " + student.toString() + "\n";
        }
        return result;
    }
}
