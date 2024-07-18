import java.util.Scanner;

public class Lab6_2Array {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // do {
    // System.out.print("Exit press number <= 0\nEnter numbers: ");
    // int[] a = new int[10];
    // int n = 0, even = 0, odd = 0;
    // boolean isGetArr = true, isPass = true;
    // while (isGetArr) {
    // a[n] = sc.nextInt();
    // if (a[n] <= 0) {
    // isGetArr = false;
    // } else {
    // if (n < 10) {
    // if (a[n] % 2 == 0) {
    // even += a[n];
    // } else {
    // odd += a[n];
    // }
    // n++;
    // } else {
    // isGetArr = false;
    // isPass = false;
    // }
    // }
    // }

    // if (isPass) {
    // System.out.println("Summary of odd numbers: " + odd + "\nSummary of even
    // numbers: " + even);
    // } else {
    // System.out.println("Array exceeds maximun array size");
    // }
    // System.out.print("Do you want to continue? (y/n): ");
    // } while (sc.next().charAt(0) == 'y');
    // }

    // ----------------------------------------------------------------

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter number of students: ");
    // int n = sc.nextInt();
    // char[] grade = { 'A', 'B', 'C', 'D', 'F' };
    // int[] freq = new int[5];
    // for (int i = 0; i < n; i++){
    // System.out.print("Enter grade of student " + (i + 1) + ": ");
    // switch (sc.next().charAt(0)){
    // case 'A':
    // freq[0]++;
    // break;
    // case 'B':
    // freq[1]++;
    // break;
    // case 'C':
    // freq[2]++;
    // break;
    // case 'D':
    // freq[3]++;
    // break;
    // case 'F':
    // freq[4]++;
    // break;
    // }
    // }
    // printChar(freq, grade);
    // }

    // public static void printChar(int[] freq, char[] grade) {
    // System.out.println("Grade Summary");
    // for (int i = 0; i < freq.length; i++) {
    // System.out.print(grade[i] + " ");
    // for (int j = 0; j < freq[i]; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // ----------------------------------------------------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.println("Enter " + n + " numbers: ");
            int[] arr = new int[n], max = new int[2], min = new int[2];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (i == 0) {
                    max[0] = arr[i];
                    min[0] = arr[i];
                } else {
                    if (arr[i] > max[0]) {
                        max[0] = arr[i];
                        max[1] = i;
                    }
                    if (arr[i] < min[0]) {
                        min[0] = arr[i];
                        min[1] = i;
                    }
                }
            }
            System.out.print("Elements: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nMax : " + max[0] + " at Pos: " + max[1]);
            System.out.println("Min : " + min[0] + " at Pos: " + min[1]);

            System.out.print("Do you want to continue (y/n): ");
        } while (sc.next().charAt(0) == 'y');
        System.out.println("Bye Bye !!!");
    }
}