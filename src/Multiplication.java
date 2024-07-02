import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of loop: ");
        int loop = sc.nextInt();
        for (int i = 0; i < loop; i++) {
            System.out.print("Number [2 to 12] :  ");
            int num = sc.nextInt();
            if (num < 2 || num > 12) {
                System.out.println("Invalid number");
                continue;
            }
            for (int j = 1; j <= 12; j++) {
                System.out.println(num + " x " + j + " = " + (num * j));
            }
        }
        System.out.println("Bye Bye !!!");
    }
}
