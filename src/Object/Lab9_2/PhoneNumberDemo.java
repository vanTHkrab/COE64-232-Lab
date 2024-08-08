package Object.Lab9_2;

import java.util.Scanner;

public class PhoneNumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of phone number: ");
        int n = sc.nextInt();
        PhoneNumber[] p = new PhoneNumber[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter phone number " + (i + 1) + ": ");
            p[i] = new PhoneNumber(sc.next());
        }

        System.out.printf("We have %d phone numbers\n", n);
        for (int i = 0; i < n; i++) {
            System.out.println("Phone number " +  (i + 1) + " is " + p[i].toString());
            System.out.print("Read as: ");
            p[i].readAs();
            System.out.println("Digit Summary: ");
            int[] result = p[i].calFreq();
            displayDigit(result);
            System.out.println();
        }
    }

    public static void displayDigit(int[] result) {
        // {0, 4, 2, 0, 0, 0, 0, 0, 0, 0}
        for (int a = 0; a < 10; a++) {
            if (result[a] != 0) {
                System.out.printf("%d ", a);
                for (int j = 0; j < result[a]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
