import java.util.Scanner;

// public class Test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter temperature t: ");
//         double t = sc.nextDouble();
//         System.out.print("Enter wind speed v: ");
//         double v = sc.nextDouble();
//         double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
//         System.out.println("Temperature = " + t);
//         System.out.println("Wind speed = " + v);
//         System.out.println("Wind chill = " + w);
//     }
// }

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        System.out.println("Distance from ( " + x1 + ", " + y1 + " ) to ( " + x2 + ", " + y2 + " ) is " + distance);
    }
}