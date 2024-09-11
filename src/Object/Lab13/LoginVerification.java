package Object.Lab13;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginVerification {

    private static String[] user;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> COE = new ArrayList<Student>();
        COE.add(new Student("67100000", "AAA", "SD0010", "Sd5648**"));
        COE.add(new Student("67110000", "BBB", "SD0011", "Sd0001**"));
        COE.add(new Student("67120000", "CCC", "SD0012", "Sd0002**"));

        ArrayList<Student> CPE = new ArrayList<Student>();
        CPE.add(new Student("67130000", "DDD", "SD0013", "Sd0003**"));
        CPE.add(new Student("67130011", "FFF", "SD0100", "Sd5648#55"));

        ArrayList<Major> majors = new ArrayList<Major>();
        majors.add(new Major("COE", COE));
        majors.add(new Major("CPE", CPE));

        displayStudents(majors);
        char se;
        do {
            System.out.println("====================================");
            System.out.print("Welcome to Login Verification\nEnter id: ");
            String id = sc.next();
            if(fetchStudentID(majors, id)) {
                System.out.print("Enter username: ");
                String username = sc.next();
                System.out.print("Enter password: ");
                String password = sc.next();
                if (verifyLogin(majors, username, password)) {
                    System.out.println("Welcome to the program");
                    profile(majors, id);
                } else {
                    System.out.println("Invalid Login");
                }
            } else {
                System.out.println("Invalid Student ID");
            }


            System.out.print("continue [y/n] ");
            se = sc.next().charAt(0);
        }while (se == 'y' || se == 'Y');
        System.out.println("Bye Bye !!!");
    }

    public static boolean verifyLogin(ArrayList<Major> majors, String username, String password) {
        for (Major major : majors) {
            for (Student student : major.getStudent()) {
                if (student.getLogin().isMatch(username, password)) {
                    user = new String[]{major.getName(), student.getStudentID()};
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean fetchStudentID(ArrayList<Major> majors, String studentID) {
        for (Major major : majors) {
            for (Student student : major.getStudent()) {
                if (student.getStudentID().equals(studentID)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void profile(ArrayList<Major> majors, String studentID) {
        for (Major major : majors) {
            for (Student student : major.getStudent()) {
                if (student.getStudentID().equals(studentID)) {
                    System.out.println("Major " + major.getName() + " " + student);
                    return;
                }
            }
        }
        System.out.println("Student ID not found");
    }

    public static void displayStudents(ArrayList<Major> majors) {
        for (Major major : majors) {
            System.out.print(major.toString());
        }
    }
}
