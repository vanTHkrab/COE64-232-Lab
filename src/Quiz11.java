import java.util.Scanner;

public class Quiz11 {
    // public static void main(String[] args) {
    // int[] a = { 1, 2, 3 };

    // int[] b = { 1, 3, 2 };

    // for (int i = 0; i < a.length; i++)

    // System.out.println(a[i] == b[i]);

    // System.out.println(a == b);
    // }

    // ----------------------------------------------------------------

    // public static void main(String[] args) {
    //     int[] a = new int[10];

    //     for (int i = 0; i < 10; i++)

    //         a[i] = 9 - i;

    //     for (int i = 0; i < 10; i++)

    //         a[i] = a[a[i]];

    //     for (int i = 0; i < 10; i++)

    //         System.out.println(a[i]);
    // }

    // ----------------------------------------------------------------

    // public static void main(String[] args) {
    //     int[] aArray = { 1, 2, 3, 4, 5 };
    //     int x;
    //     for (x = 0; x < aArray.length; x++) {
    //         System.out.println(aArray[x]);
    //     }

    //     for (x = 0; x < aArray.length; x++) {
    //         aArray[x] = aArray[x] * 2;
    //     }

    //     for (x = 0; x < aArray.length; x++) {
    //         System.out.println(aArray[x]);
    //     }
    // }

    // ----------------------------------------------------------------

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] a = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         a[i] = sc.nextInt();
    //     }

    //     System.out.println("a[]");
    //     prnitArray(a);

    //     double sum = a[0];
    //     double max = a[0];

    //     for (int i = 1; i < n; i++) {
    //         sum += a[i];
    //         if (a[i] > max) {
    //             max = a[i];
    //         }
    //     }
    //     System.out.println("Sum : " + sum);

    //     int[] b = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         b[i] = a[i];
    //     }

    //     System.out.println();
    //     System.out.println("b[]");
    //     prnitArray(b);
        
    // }

    // public static void prnitArray(int[] aa) {
    //     for (int i = 0; i < aa.length; i++) {
    //         System.out.println(aa[i]);
    //     }
    //     System.out.println();    
    // }

    // ----------------------------------------------------------------

    public static void main(String[] args) {
        int tmp, x, y;
        int[] sum = {0, 0};
        int[][] emp = new int[2][3];
        Scanner sc = new Scanner(System.in);

        for (x = 0; x < emp.length; x++) {
            for (y = 0; y < emp[x].length; y++) {
                System.out.print("Enter no. of employee " + (x + 1) + ", floor " + (y + 1) + " : ");
                emp[x][y] = sc.nextInt();
            }
        }

        for (x = 0; x < emp.length; x++) {
            tmp = 0;
            for (y = 0; y < emp[x].length; y++) {
                tmp += emp[x][y];
            }
            sum[x] = tmp;
        }

        int sumf3 = 0, total = 0;
        for (x = 0; x < emp.length; x++) {
            sumf3 += emp[x][2];
        }

        for (x = 0; x < emp.length; x++) {
            total += sum[x];
        }

        for (x = 0; x < emp.length; x++) {
            System.out.println("Total employee in floor " + (x + 1) + " : " + sum[x]);
        }
        System.out.println("Total employee in floor 3 : " + sumf3);
        System.out.println("Total employee in building : " + total);
    }
}
