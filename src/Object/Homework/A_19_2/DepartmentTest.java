package Object.Homework.A_19_2;


import java.util.ArrayList;

public class DepartmentTest {

    public static void main(String[] args) {

        Lecturer ak = new Lecturer("Arun Kumar");
        Lecturer ry = new Lecturer("Rahul Yadav");

        Department cse = new Department("CSE");

        ArrayList<Lecturer> staff_cse = new ArrayList<Lecturer>();
        staff_cse.add(ak);
        staff_cse.add(ry);

        cse.setStaff(staff_cse);

        System.out.println("The staff of department " + cse.getName() + " is: " + cse.getStaff());
    }
}