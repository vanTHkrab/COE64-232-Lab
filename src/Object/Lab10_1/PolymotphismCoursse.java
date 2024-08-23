package Object.Lab10_1;

import java.util.ArrayList;
import java.util.Scanner;

public class PolymotphismCoursse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Course> course = new ArrayList<>();
        // Course gen1 = new GenEdCourse("GEN64-124", 4, "D+");
        // Course gen2 = new GenEdCourse("GEN64-183", 1, "A");
        // Course gen3 = new GenEdCourse("ITD64-172", 2, "C+");
        course.add(new GenEdCourse("GEN64-124", 4, "D+"));
        course.add(new GenEdCourse("GEN64-183", 1, "A"));
        course.add(new GenEdCourse("ITD64-172", 2, "C+"));

        course.add(new MajorCourse("COE64-211", 4, "D", 2));
        course.add(new MajorCourse("COE64-212", 4, "D", 2));
        course.add(new MajorCourse("COE64-322", 1, "W", 3));

        System.out.println("Courses: ");
        displayCourse(course);
        
        System.out.println("====================================");
        System.err.print("Change grade of subject: ");
        String id = sc.next();
        System.out.print("Change to grade: ");
        String grade = sc.next();
        changesGrade(course, id, grade);

        System.out.println("====================================");
        System.out.println("Add new course: ");
        System.out.print("Course ID: ");
        String c = sc.next();
        System.out.print("Unit: ");
        int u = sc.nextInt();
        System.out.print("Grade: ");
        String g = sc.next();
        System.out.print("Year: ");
        int y = sc.nextInt();
        course.add(new MajorCourse(c, u, g, y));
        
        System.out.println("====================================");
        System.out.println("Delete course: ");
        System.out.print("Course ID: ");
        String del = sc.next();
        delCourse(course, del);
        
        System.out.println("====================================");
        System.out.println("Courses: ");
        displayCourse(course);
    }

    public static void displayCourse(ArrayList<Course> c) {
        int enroll = 0;
        for (Course course : c) {
            System.out.println(course);
            enroll++;
        }
        System.err.println("===================================");
        System.out.println("Enroll: " + enroll + "    Pass: " + calPassSubject(c));
        System.err.printf("GPA: %.2f\n", calGpa(c));
    }

    public static int calPassSubject(ArrayList<Course> c) {
        int count = 0;
        String arr[] = { "A", "B+", "B", "C+", "C", "D+", "D" };
        for (Course course : c) {
            for (String s : arr) {
                if (course.getGrade().equals(s)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static double calGpa(ArrayList<Course> c) {
        double gpa = 0, unit = 0;
        for (Course course : c) {
            if (course.getGrade().equals("A")) {
                gpa += 4 * course.getUnit();
            } else if (course.getGrade().equals("B+")) {
                gpa += 3.5 * course.getUnit();
            } else if (course.getGrade().equals("B")) {
                gpa += 3 * course.getUnit();
            } else if (course.getGrade().equals("C+")) {
                gpa += 2.5 * course.getUnit();
            } else if (course.getGrade().equals("C")) {
                gpa += 2 * course.getUnit();
            } else if (course.getGrade().equals("D+")) {
                gpa += 1.5 * course.getUnit();
            } else if (course.getGrade().equals("D")) {
                gpa += 1 * course.getUnit();
            }
            if (!course.getGrade().equals("W")) unit += course.getUnit();
        }
        return gpa / unit;
    }

    public static void changesGrade(ArrayList<Course> c, String id, String grade) {
        for (Course course : c) {
            if (course.getCourseID().equals(id)) {
                course.setGrade(grade);
            }
        }
    }

    public static void delCourse(ArrayList<Course> c, String id) {
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).getCourseID().equals(id)) {
                c.remove(i);
            }
        }
    }
}
