package Lab1;
import java.util.Scanner;

public class Day2YMD {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter total day: ");
        int day = sc.nextInt();

        int year = day / 365;
        day %= 365;
        
        int month = day / 30;
        day %= 30;

        System.out.println("Year = " + year);
        System.out.println("Month = " + month);
        System.out.println("Day = " + day);

    }
}
