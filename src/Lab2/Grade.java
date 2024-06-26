package Lab2;

import java.util.Scanner;

public class Grade {
    public static void mai (String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        System.out.println("Grade: " + grade);
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}
