import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Centigrade: ");
        c = input.nextDouble();
        c2F(c);
    }

    public static void c2F(double c) {
        double f = (c * 9.0 / 5.0) + 32;
        System.out.println("Fahrenheit: " + f);
    }

    public static 
}

