package test;

import java.util.Scanner;

/**
 * Innermidterm2
 */

public class Innermidterm2 {

    public static void display(int[] arr) {
        System.out.println("Displaying array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // random 10 number
        int[] arr = { 9, 5, 6, 7, 8, 1, 2, 3, 4, 5 };
        display(arr);
        do {
            System.out.print("Find the number of elements: ");
            int num = sc.nextInt();
            boolean isNotfound = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    System.out.println(num + " Found at index: " + i);
                    isNotfound = false;
                }
            }
            if (isNotfound) {
                System.out.println(num + " is Not found");
            }
            System.out.print("Do you want to continue? (y/n): ");
        } while (sc.next().charAt(0) == 'y');
        System.out.println("Bye Bye !!!");
    }
}