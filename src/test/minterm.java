package test;

import java.util.Scanner;
import java.text.DecimalFormat;

public class minterm {
    private static DecimalFormat df = new DecimalFormat("0.00000");
    // public static void main(String[] args) {
    //     double[] unit = {1, 0.5, 1, 0.5, 1};
    //     int[] score = {98, 72, 65, 51, 49};
    //     char[] grade = new char[score.length];
    //     double sumunit = 0, sumgrade = 0;
    //     for (int i = 0; i < score.length; i++) {
    //         grade[i] = calGrade(score[i]);
    //         sumunit += unit[i];
    //         sumgrade += calGPA(score[i]) * unit[i];
    //     }

    //     sumgrade /= sumunit;

    //     System.out.print("Subject    ");
    //     for (int i = 0; i < score.length; i++) {
    //         System.out.print(i + "    ");
    //     }
    //     System.out.print("\n============================\nUnit     ");
    //     for (int i = 0; i < unit.length; i++) {
    //         System.out.print(unit[i] + "  ");
    //     }
    //     System.out.print("\nScore     ");
    //     for (int i = 0; i < score.length; i++) {
    //         System.out.print(score[i] + "   ");
    //     }

    //     System.out.print("\nGrade      ");
    //     for (int i = 0; i < grade.length; i++) {
    //         System.out.print(grade[i] + "    ");
    //     }

    //     System.out.print("\n============================\nGPA = " + sumgrade);

    // }

    // public static char calGrade(int score) {
    //     if (score >= 80) {
    //         return 'A';
    //     }
    //     else if (score >= 70) {
    //         return 'B';
    //     }
    //     else if (score >= 60) {
    //         return 'C';
    //     }
    //     else if (score >= 50) {
    //         return 'D';
    //     } else {
    //         return 'F';
    //     }
    // }

    // public static char calGPA(int score) {
    //     if (score >= 80) {
    //         return 4;
    //     }
    //     else if (score >= 70) {
    //         return 3;
    //     }
    //     else if (score >= 60) {
    //         return 2;
    //     }
    //     else if (score >= 50) {
    //         return 1;
    //     } else {
    //         return 0;
    //     }
    // }

    // =================================================================

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Size ");
    //     int n = sc.nextInt();
    //     int[][] aArray = createMatrix(n);
    //     int[][] bArray = createMatrix(n);

    //     subMatrix(aArray, bArray);
    //     printMatrix(subMatrix(aArray, bArray));
    // }

    // public static int[][] createMatrix(int n) {
    //     Scanner sc = new Scanner(System.in);
    //     int[][] matrix = new int[n][n];
    //     for(int i = 0; i < n; i++) {
    //         for(int j = 0; j < n; j++) {
    //             System.out.print("row " + ( j + 1 ) + " ");
    //             matrix[i][j] = sc.nextInt();
    //         }
    //     }
    //     return matrix;
    // }

    // public static int[][] subMatrix(int[][] aArray, int[][] bArray) {
    //     int n = aArray.length;
    //     int[][] result = new int[n][n];
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             result[i][j] = aArray[i][j] - bArray[i][j];
    //         }
    //     }
    //     return result;
    // }
    // public static void printMatrix(int[][] nArray) {
    //     int n = nArray.length;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             System.out.print(nArray[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // ============================================================================

    // public static void main(String[] args) {
    //     int[][] SAttQ = {
    //         {1, 2, 1, 3, 3, 4, 5, 5, 1, 4},
    //         {4, 2, 1, 2, 3, 1, 5, 5, 1, 4},
    //         {5, 4, 4, 1, 3, 2, 5, 5, 1, 4},
    //         {3, 2, 1, 5, 4, 3, 5, 5, 1, 4},
    //         {1, 2, 4, 3, 3, 4, 5, 5, 1, 4},
    //         {2, 2, 5, 3, 3, 4, 5, 5, 1, 4},
    //         {2, 2, 1, 3, 3, 4, 5, 5, 1, 4},
    //         {5, 2, 5, 3, 3, 4, 5, 5, 1, 4},
    //     };
    //     int[] KttQ = {4, 2, 4, 3, 3, 4, 1, 5,1 ,4};
    //     for (int i = 0; i < SAttQ.length; i++) {
    //         int score = 0;
    //         System.err.print("Student " + (i + 1) + " ");
    //         for (int j = 0; j < KttQ.length; j++) {
    //             if (SAttQ[i][j] == KttQ[j]) score++;
    //         }
    //         System.err.println(score);
    //     }
    // }

    // ============================================================================

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a, b, c: ");
    //     double a = sc.nextInt();
    //     double b = sc.nextInt();
    //     double c = sc.nextInt();
    //     double s = 0.5 * (a + b + c);
    //     double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    //     System.out.println("Area = " + df.format(area));
    // }

    // ============================================================================

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.err.print("Number of secounds : ");
    //     int sec = sc.nextInt();
    //     int hour = sec / 3600;
    //     sec %= 3600;
    //     int min = sec / 60;
    //     sec %= 60;
    //     System.out.println(hour + " " + min + " " + sec);
    // }

    // ============================================================================

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int x1 = sc.nextInt();
    //     int y1 = sc.nextInt();
    //     int x2 = sc.nextInt();
    //     int y2 = sc.nextInt();

    //     System.out.println(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    // }

    // ============================================================================

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int min = Integer.MAX_VALUE;
    //     for (int i = 0; i < 3; i++) {
    //         int n = sc.nextInt();
    //         if (n < min) {
    //             min = n;
    //         }
    //     }

    //     System.out.println(min);
    // }

    // ============================================================================

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     char choice = sc.nextLine().charAt(0);
    //     int x = sc.nextInt();
    //     int y = sc.nextInt();
    //     switch (choice) {
    //         case 'A':
    //             System.out.println(x + y);
    //             break;
    //         case 'B':
    //             System.out.println(x - y);
    //             break;
    //         case 'C':
    //             System.out.println(x * y);
    //             break;
    //         case 'D':
    //             System.out.println(x / y);
    //             break;
    //         default:
    //             System.out.println("In");
    //             break;
    //     }
    // }

    // ===================================================

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     char c = sc.nextLine().charAt(0); 
    //     if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
    //         switch (c) {
    //             case 'A': case 'a': case 'E': case 'e': case 'I': case 'i': case 'O': case 'o': case 'U': case 'u':
    //                 System.out.println("vowel");
    //                 break;
    //             default:
    //                 System.out.println("con");
    //                 break;
    //         }
    //     } else if (c >= '0' && c <= '9'){
    //         System.out.println("num");
    //     } else {
    //         System.out.println("spec");
    //     }
    // }

    // ===================================================

    // public static void main(String[] args) {
    //     for (int t = 1, row = 1; t < 20; row++, t += 2) {
    //         System.err.print(t + " ");
    //         if (row == 2) {
    //             row = 0;
    //             System.out.println();
    //         }
    //     }
    // }

    // ===================================================

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     if (n < 10) {
    //         System.out.println(n);
    //     } else if (n <= 15) {
    //         System.out.println((char)(n % 10 + 65));
    //     } else {
    //         System.out.println("w");
    //     }
    // }

    // ===================================================

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         char[] grade = {'A', 'B', 'C', 'D', 'F'};
         int n = sc.nextInt();
         int[] freq = new int[5];
         for (int i = 0; i < n; i++) {
             switch (sc.next().charAt(0)) {
                 case 'A':
                     freq[0]++;
                     break;
                 case 'B':
                     freq[1]++;
                     break;
                 case 'C':
                     freq[2]++;
                     break;
                 case 'D':
                     freq[3]++;
                     break;
                 case 'F':
                     freq[4]++;
                     break;
                 default:
                     break;
             }
         }
         printChar(freq, grade);
     }

     public static void printChar(int[] freq, char[] grade) {
         for (int i = 0; i < grade.length; i++) {
             System.out.print(grade[i] + " ");
             for (int j = 0; j < freq[i]; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }

    // =====================================================
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, e = 0, o = 0, n, t = 0;
//        do {
//            n = sc.nextInt();
//            if (n != 0) {
//                if (n % 2 == 0) e += n;
//                else o += n;
//
//                if(n > max) max = n;
//                else min = n;
//                t++;
//            }
//        } while(n != 0);
//        if (t<=0) {
//            System.out.println(o);
//            System.out.println(e);
//            System.out.println(max);
//            System.out.println(min);
//        } else {
//            System.out.println("In");
//        }
//    }
}
