import java.util.Scanner;

public class Lab7_1Array {
    // public static void main(String[] args) {
    //     double[] unit = {1, 0.5, 1, 0.5, 1};
    //     int[] score = {98, 72, 65, 51, 49};
    //     char[] grade = new char[5];
    //     for (int i = 0; i < 5; i++) {
    //         grade[i] = calGrade(score[i]);
    //     }

        
    //     System.err.print("Subject ");
    //     for (int i = 0; i < 5; i++) {
    //         System.err.print((i + 1) + "   ");
    //     }
    //     System.out.println("\n===========================");
        
    //     System.err.print("Unit    ");
    //     for (int i = 0; i < 5; i++) {
    //         System.err.print(unit[i] + " ");
    //     }
    //     System.err.print("\nScore   ");
    //     for (int i = 0; i < 5; i++) {
    //         System.err.print(score[i] + "  ");
    //     }

    //     System.err.print("\nGrade   ");
    //     for (int i = 0; i < 5; i++) {
    //         System.err.print(grade[i] + "   ");
    //     }
    //     double sum = 0, sumu = 0;
    //     for (int i = 0; i < 5; i++) {
    //         sum += calGpa(grade[i]) * unit[i];
    //         sumu += unit[i];
            
    //     }

    //     System.err.print("\n===========================\nGPA = " + (sum / sumu));
        
    // }

    // public static char calGrade(int score) {
    //     if (score >= 80) {
    //         return 'A';
    //     } else if (score >= 70) {
    //         return 'B';
    //     } else if (score >= 60) {
    //         return 'C';
    //     } else if (score >= 50) {
    //         return 'D';
    //     } else {
    //         return 'F';
    //     }
    // }

    // public static double calGpa(char grade) {
    //     switch (grade) {
    //         case 'A':
    //             return 4;
    //         case 'B':
    //             return 3;
    //         case 'C':
    //             return 2;
    //         case 'D':
    //             return 1;
    //         default:
    //             return 0;
    //     }
    // }

    // -------------------------------------------------------------------------------------

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Matrix size: ");
    //     int n = sc.nextInt();
    //     int[][] aArray = createMatrix(n);
    //     int[][] bArray = createMatrix(n);
    //     System.out.println("___");
    //     printMatrix(aArray);
    //     System.out.println("___\n -\n___");
    //     printMatrix(bArray);
    //     System.out.println("___\n =\n___");
    //     printMatrix(subMatrix(aArray, bArray));
    //     System.err.println("___");
    // }

    // public static int[][] createMatrix(int n) {
    //     Scanner sc = new Scanner(System.in);
    //     int[][] matrix = new int[n][n];
    //     for (int i = 0; i < n; i++) {
    //         System.out.print("Enter row " + (i + 1) + ": ");
    //         for (int j = 0; j < n; j++) {
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

    // public static void printMatrix(int[][] matrix) {
    //     int n = matrix.length;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // -------------------------------------------------------------------------------------

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
    //         System.out.println("Student " + (i + 1) + " score: " + MCT(SAttQ, KttQ)[i]);
    //     }
    // }

    // public static int[] MCT(int[][] SAttQ, int[] KttQ) {
    //     int[] score = new int[SAttQ.length];
    //     for (int i = 0; i < SAttQ.length; i++) {
    //         int sum = 0;
    //         for (int j = 0; j < SAttQ[i].length; j++) {
    //             if (SAttQ[i][j] == KttQ[j]) {
    //                 sum += 1;
    //             }
    //         }
    //         score[i] = sum;
    //     }
    //     return score;
    // }

    // -------------------------------------------------------------------------------------

    public static void main(String[] args) {
        int[][] SAttQ = {
            {1, 2, 1, 3, 3, 4, 5, 5, 1, 4},
            {4, 2, 1, 2, 3, 1, 5, 5, 1, 4},
            {5, 4, 4, 1, 3, 2, 5, 5, 1, 4},
            {3, 2, 1, 5, 4, 3, 5, 5, 1, 4},
            {1, 2, 4, 3, 3, 4, 5, 5, 1, 4},
            {2, 2, 5, 3, 3, 4, 5, 5, 1, 4},
            {2, 2, 1, 3, 3, 4, 5, 5, 1, 4},
            {5, 2, 5, 3, 3, 4, 5, 5, 1, 4},
        };
        int[] KttQ = {4, 2, 4, 3, 3, 4, 1, 5,1 ,4};
        for (int i = 0; i < SAttQ.length; i++) {
            int sum = 0;
            for (int j = 0; j < SAttQ[i].length; j++) {
                if (SAttQ[i][j] == KttQ[j]) {
                    sum += 1;
                }
            }
            System.out.println("Student " + (i + 1) + " score: " + sum);
        }
    }
}
