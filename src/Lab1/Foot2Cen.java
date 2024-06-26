package Lab1;
import java.util.Scanner;

public class Foot2Cen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter feet and inch: ");
        int feet_get = sc.nextInt();
        int inch_get = sc.nextInt();

        System.out.println("You are " + feet_get + " feel, " + inch_get + " inches tall.");
        int total_inch = (12 * feet_get) + inch_get;
        System.out.println("Total inches: " + total_inch);
        System.out.println("Total inches: " + total_inch * 2.54);
    }
}
