package Object.Homework.A_19_2;

import java.util.ArrayList;

public class Department {
    private String name;
    ArrayList<Lecturer> staff;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setStaff(ArrayList<Lecturer> staff) {
        this.staff = staff;
    }

    public ArrayList<String> getStaff() {
        ArrayList<String> professor_names = new ArrayList<String>();
        for(Lecturer prof : this.staff) {
            professor_names.add(prof.getName());
        }

        return professor_names;
    }
}
