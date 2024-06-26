package Lab2;
import java.util.Scanner;

public class RGBColorDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("RGB Color Difference");
        System.out.print("RGB Color1 (R, G, B): ");
        int R1 = sc.nextInt();
        int G1 = sc.nextInt();
        int B1 = sc.nextInt();
        System.out.print("RGB Color2 (R, G, B): ");
        int R2 = sc.nextInt();
        int G2 = sc.nextInt();
        int B2 = sc.nextInt();
        double RGB_Difference = Math.sqrt(Math.pow(R1 - R2, 2) + Math.pow(G1 - G2, 2) + Math.pow(B1 - B2, 2));
        System.out.println("Color Difference: " + RGB_Difference);
    }
}
