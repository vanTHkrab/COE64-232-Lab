package test.B;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> coe = new ArrayList<>();
        ArrayList<Student> cba = new ArrayList<>();
        ArrayList<Major> m = new ArrayList<>();

        coe.add(new Student("12345", "John Doe", new Login("john doe", "password")));
        coe.add(new Student("67890", "Jane Doe", new Login("random", "password")));
        coe.add(new Student("13579", "James Doe", new Login("mesdames", "password")));

        cba.add(new Student("24680", "Jill Doe", new Login("evildoer", "password")));
        cba.add(new Student("97531", "Jack Doe", new Login("jack doe", "password")));
        cba.add(new Student("86420", "Jenny Doe", new Login("jenny doe", "password")));

        m.add(new Major("Computer Science", coe));

        m.add(new Major("Business Administration", cba));

        displayMajor(m);
        System.out.print("\nEnter Student ID: ");
        String id = sc.nextLine();
        int[] result = verifyStudent(m, id);
        if (result != null) {
            System.out.println("Login successful.");
            System.out.println("Student ID: " + m.get(result[0]).getStudents().get(result[1]).getStudentID());
            System.out.println("Student Name: " + m.get(result[0]).getStudents().get(result[1]).getLogin().getUsername());
            System.out.println(m.get(result[0]).getStudents().get(result[1]).getLogin().toString());
        }
    }

    public static void displayMajor(ArrayList<Major> m) {
        for (Major major : m) {
            System.out.println(major.toString());
        }
    }

    public static int[] verifyStudent(ArrayList<Major> m, String id) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[2];
        for (int i = 0; i < m.size(); i++) {
            for (int j = 0; j < m.get(i).getStudents().size(); j++) {
                if (m.get(i).getStudents().get(j).getStudentID().equals(id)) {
                    result[0] = i;
                    result[1] = j;
                    while (true){
                        System.out.print("Enter Username: ");
                        String username = sc.nextLine();
                        System.out.print("Enter Password: ");
                        String password = sc.nextLine();
                        if (verifyLogin(m, result, username, password)) {
                            return result;
                        } else {
                            System.out.println("Invalid username or password.");
                        }
                        System.out.print("Try again? (Y/N): ");
                        String choice = sc.nextLine();
                        if (choice.equalsIgnoreCase("N")) {
                            return null;
                        }
                    }
                }
            }
        }
        System.out.println("Student not found.");
        return null;
    }

    public static boolean verifyLogin(ArrayList<Major> m, int[] result, String username, String password) {
        return m.get(result[0]).getStudents().get(result[1]).getLogin().isMatch(username, password);
    }
}