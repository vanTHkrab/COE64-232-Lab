import java.util.Scanner;

public class DisplaySum {
    public static void main(String[] args) {
        // double value, ans = 0;
        // System.out.print("Input number with 2 floating points: ");
        // Scanner sc = new Scanner(System.in);
        // value = sc.nextDouble();
        // ans = value;
        // do {
        //     ans += 3.33;
        //     if (ans <= 30.00) {
        //         System.out.println(value + " + 3.33 = " + ans);
        //         value = ans;
             
        //     }
        // } while (ans < 30.00);
        // System.out.println("Sorry, the sum exceeds 30. Bye Bye !!!");
        int i, j, n;
        System.out.print("Enter the number of n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    
    }
}
