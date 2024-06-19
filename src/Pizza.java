import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius (inches): ");
        int radius_get = sc.nextInt();

        System.out.print("Enter price: ");
        int price_get = sc.nextInt();

        System.out.println("Price per square inch: " + (price_get / (Math.PI * Math.pow(radius_get, 2))));   
    }
}
