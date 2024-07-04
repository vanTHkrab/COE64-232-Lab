import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.print("Enter the number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
