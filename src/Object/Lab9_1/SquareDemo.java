package Object.Lab9_1;

import java.util.Scanner;

public class SquareDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square s1 = new Square();
        Square s2 = new Square();

        System.out.print("Enter width of square 1st square: ");
        s1.setWidth(sc.nextInt());

        System.out.print("Enter width of square 2nd square: ");
        s2.setWidth(sc.nextInt());

        System.out.println("\nDisplay Square Information");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("===== Change width of all square object =====\n");
        System.out.print("Enter new width of square 1st square: ");
        s1.setWidth(sc.nextInt());

        System.out.print("Enter new width of square 2nd square: ");
        s2.setWidth(sc.nextInt());

        System.out.println("\nDisplay Square Information");
        System.out.println(s1);
        System.out.println(s2);
    }
}
