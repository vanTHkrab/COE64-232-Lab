package Object.Lab10_1;

import java.util.Scanner;

public class CourseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] gen = new Course[3];
        gen[0] = new GenEdCourse("GEN64-124", 4, "D+");
        gen[1] = new GenEdCourse("GEN64-183", 1, "A");
        gen[2] = new GenEdCourse("ITD64-172", 2, "C+");

        Course[] major = new Course[3];
        major[0] = new MajorCourse("COE64-211", 4, "D", 2);
        major[1] = new MajorCourse("COE64-212", 4, "D", 2);
        major[2] = new MajorCourse("COE64-322", 1, "W", 3);

        System.out.println("General Education Courses: ");
        displayCourse(gen);
        System.out.println("====================================");
        System.out.println("Major Courses: ");
        displayCourse(major);
        System.out.println("====================================");
        System.out.printf("GPA: %.2f\n", calGpa(gen, major));
        System.out.println("====================================");

        System.err.print("Change grade of subject: ");
        String id = sc.next();
        System.out.print("Change to grade: ");
        String grade = sc.next();
        changesGrade(gen, id, grade);
        changesGrade(major, id, grade);

        System.out.println("====================================");
        System.out.println("General Education Courses: ");
        displayCourse(gen);
        System.out.println("====================================");
        System.out.println("Major Courses: ");
        displayCourse(major);
        System.out.println("====================================");
        System.out.printf("GPA: %.2f\n", calGpa(gen, major));
    }

    public static void displayCourse(Course[] c) {
        int enroll = 0;
        for (Course course : c) {
            System.out.println(course);
            enroll++;
        }
        System.out.println("Enroll: " + enroll + "    Pass: " + calPassSubject(c));
    }

    public static int calPassSubject(Course[] c) {
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

    public static double calGpa(Course[] c, Course[] c2) {
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
        for (Course course : c2) {
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
        System.out.println("Total unit: " + unit);
        System.out.println("Total GPA: " + gpa);
        return gpa / unit;
    }

    public static void changesGrade(Course[] c, String id, String grade) {
        for (Course course : c) {
            if (course.getCourseID().equals(id)) {
                course.setGrade(grade);
            }
        }
    }
}
