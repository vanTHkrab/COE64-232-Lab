package Lab1;
import java.util.Scanner;

public class TestX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 8, b = 16, c = 7, d = 5;

        System.out.print("Enter x : ");
        int x = sc.nextInt();

        double z;

        if (x == 0) {
            z = a / b + (c / (2 * d));
        } else if (x % 2  == 0) {
            z = (Math.pow(a, 2) + Math.pow(b, 2)) / (Math.abs(a - b));
        } else {
            z = ((a * c) / b) + d;
        }

        System.out.println("z is : " + z);
    }
}
