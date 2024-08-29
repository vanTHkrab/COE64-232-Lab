package Object.Lab12_2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> coe = new ArrayList<Student>();
        coe.add(new Student("67100000", "AAA"));
        coe.add(new Student("67110000", "BBB"));
        coe.add(new Student("67120000", "CCC"));

        ArrayList<Student> cpe = new ArrayList<Student>();
        cpe.add(new Student("67130000", "DDD"));
        cpe.add(new Student("67130011", "FFF"));

        ArrayList<Major> major = new ArrayList<Major>();

        major.add(new Major("COE", coe));
        major.add(new Major("CPE", cpe));
        major.add(new Major("CVE", new ArrayList<Student>()));

        System.out.print(major.get(0));
        System.out.print(major.get(1));

        moveStudent(major, "CPE", "CVE", "67130000");
//        move2(major.get(1), major.get(2), "67130011");

        System.out.print(major.get(0));
        System.out.print(major.get(1));
        System.out.print(major.get(2));

        char c;

        do {
            System.out.print("Search Menu\n1: By Major\n2: By Student ID\nEnter: ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter major: ");
                    searchByMajor(new ArrayList<Major>() {{
                        add(major.get(0));
                        add(major.get(1));
                        add(major.get(2));
                    }}, sc.next());
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    searchByStudentID(new ArrayList<Major>() {{
                        add(major.get(0));
                        add(major.get(1));
                        add(major.get(2));
                    }}, sc.next());
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Do you want to continue? (y/n): ");
            c = sc.next().charAt(0);
        } while (c == 'y' || c == 'Y');
        System.out.println("Bye Bye !!!");
        sc.close();
    }

    public static void moveStudent(ArrayList<Major> major, String fromMajor, String toMajor, String studentID) {
        Student student = null;
        boolean isFound = false;
        for(Major m : major) {
            if(m.getName().equals(fromMajor)) {
                for(Student s : m.getStudents()) {
                    if(s.getStudentID().equals(studentID)) {
                        student = s;
                        isFound = true;
                    }
                }
            }
        }
        if(student != null) {
            for(Major m : major) {
                if(m.getName().equals(fromMajor)) {
                    m.deleteStudent(m.getStudents().indexOf(student));
                }
                if(m.getName().equals(toMajor)) {
                    m.addStudent(student);
                }
            }
        }
        if(!isFound) {
            System.out.println("Not found");
        }
    }

//    public static void move2(String fromMajor, String toMajor, String studentID) {
//        Student student = null;
//        boolean isFound = false;
//        for(Student s : fromMajor.getStudents()) {
//            if(s.getStudentID().equals(studentID)) {
//                student = s;
//                isFound = true;
//            }
//        }
//        if(student != null) {
//            fromMajor.deleteStudent(fromMajor.getStudents().indexOf(student));
//            toMajor.addStudent(student);
//        }
//        if(!isFound) {
//            System.out.println("Not found");
//        }
//    }

    public static void searchByMajor(ArrayList<Major> majors, String major) {
        boolean isFound = false;
        for(Major m : majors) {
            if(m.getName().equals(major)) {
                System.out.println(m);
                isFound = true;
            }
        }
        if(!isFound) {
            System.out.println("Not found");
        }
    }

    public static void searchByStudentID(ArrayList<Major> majors, String studentID) {
        boolean isFound = false;
        for(Major m : majors) {
            for(Student s : m.getStudents()) {
                if(s.getStudentID().equals(studentID)) {
                    System.out.println(s);
                    isFound = true;
                }
            }
        }
        if(!isFound) {
            System.out.println("Not found");
        }
    }
}
