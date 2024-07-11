import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab5_1Methods {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Start number : ");
    //     int n1 = sc.nextInt();
    //     System.out.print("End number : ");
    //     int n2 = sc.nextInt();
    //     displayEven(n1, n2);
    //     System.out.println();
    //     displayOdd(n1, n2);
    // }

    // public static void displayEven(int n1, int n2) {
    //     System.out.print("Event number : ");
    //     for (int i = n1; i <= n2; i++) {
    //         if (i % 2 == 0) System.out.print(i + " ");
    //     }
    // }

    // public static void displayOdd(int n1, int n2) {
    //     System.out.print("Odd number : ");
    //     for (int i = n1; i <= n2; i++) {
    //         if (i % 2 != 0) System.out.print(i + " ");
    //     }
    // }

    // ----------------------------------------------------------------

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int i = 0, max = 0, cm = 0;
    //     double cmc = 0.00, maxCm = 0.00;
    //     do {
    //         i++;
    //         System.out.print("No. " + i + " Enter height : ");
    //         if (sc.next().charAt(0) == 'f') {
    //             int foot = sc.nextInt();
    //             int inch = sc.nextInt();
    //             cmc = Foot2Cm(foot, inch);
    //             System.out.println("No. " + i +  " is : " + cmc + " cm.");
    //         } else {
    //             cmc = cm = sc.nextInt();
    //             System.out.println("No. " + i +  " is : " + cm + " cm.");
    //         }
    //         if (cmc > maxCm) {
    //             maxCm = cm;
    //             max = i;
    //         }
    //         System.out.print("you want to continue (y/n) : ");
    //     } while (sc.next().charAt(0) == 'y');
    //     System.out.println("No. " + max + " is the tallest.\nBye Bye !!!");
    // }

    // public static double Foot2Cm(int foot, int inch) {
    //     return (foot * 12 + inch) * 2.54;
    // }

    // ----------------------------------------------------------------

    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double per = 0.00, total = 0.00, p = 0.00;
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        total = n;
        while (n-- > 0) {
            int i = 3, sum = 0;
            while (i-- > 0) {
                int die = (int) (Math.random() * 6) + 1;
                sum += die;
                System.out.print(die + " ");
            }
            if (isBetween6And12(sum)) {
                System.out.println("Between 6 and 12");
                p++;
            } else {
                System.out.println("Out of range");
            }
        }
        per = p * 100.00 / total;
        System.out.println("Percentage " + df.format(per) + "%");
    }

    public static boolean isBetween6And12(int n) {
        return n >= 6 && n <= 12;
    }
} 