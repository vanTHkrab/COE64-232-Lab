import java.util.Scanner;

public class Lab6_1Methods {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter no of loop : ");
    //     int n = sc.nextInt();
    //     for (int i = 0; i < n; i++) {
    //         int n1 = sc.nextInt();
    //         int n2 = sc.nextInt();
    //         printNum(n1, n2);
    //     }
    // }

    // public static void printNum(int n1, int n2) {
    //     for (int i = 1; i <= n1; i++) {
    //         for (int j = 1; j <= n2; j++) {
    //             System.out.print(i + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // ----------------------------------------------------------------

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     do {
    //         System.out.print("x : ");
    //         int x = sc.nextInt();
    //         System.out.print("y : ");
    //         int y = sc.nextInt();
    //         if (x < y) {
    //             System.out.println("Answer : " + sumXtoY(x, y));
    //         } else if (x > y) {
    //             System.out.println("Answer : " + mulXtoY(x, y));
    //         } else {
    //             System.out.println("Answer : 0");
    //         }
    //         System.out.print("Do you want to continue (y/n) : ");
    //     } while (sc.next().charAt(0) == 'y');
    // }

    // public static int sumXtoY(int x, int y) {
    //     int sum = 0;
    //     for (int i = x; i <= y; i++) {
    //         sum += i;
    //     }
    //     return sum;
    // }

    // public static int mulXtoY(int x, int y) {
    //     int mul = 1;
    //     for (int i = x; i >= y; i--) {
    //         mul *= i;
    //     }
    //     return mul;
    // }

    // ----------------------------------------------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID number : ");
        String s = sc.nextLine();
        Check12DigitFirst(s);
    }

    public static void Check12DigitFirst(String s) {
        int sum2 = 0;
        for (int i = 0, j = s.length() + 1; i < s.length() - 1; i++) {
            int sum = Integer.parseInt(s.substring(i, i + 1));
            sum2 += sum * j - Integer.parseInt(s.substring(i, i + 1));
            j--;
        }

        int mod11 = sum2 % 11;
        if (mod11 == 0) {
            int mod10 = mod11 % 10;
            s = s.substring(0, s.length() - 1) + ((11 - mod10) % 10);
            System.out.println("Invalid\nValid ID number : " + s );
        } else {
            System.out.println("Valid");
        }
    }
}