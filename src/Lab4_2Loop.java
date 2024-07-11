import java.util.Scanner;

public class Lab4_2Loop {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String choice;
        // do {
            //  while(isContinue){
                // boolean isContinue = true;
        //         System.out.print("Number [2 to 12] :  ");
        //         int num = sc.nextInt();
        //         if (num < 2 || num > 12) {
        //             System.out.println("Invalid number");
        //             isContinue = true;           
        //         } else {
        //             for (int j = 1; j <= 12; j++) {
        //                 System.out.println(num + " x " + j + " = " + (num * j));
        //                 isContinue = false;
        //             }
        //         }
        //     }
        //     System.out.print("Do you want to continue [y/n] :");
        //     choice = sc.next().charAt(0) + "";
        // } while(choice.equalsIgnoreCase("y"));
        // System.out.println("Bye Bye !!!");

        // --------------------------------------------------------------

        // Scanner sc = new Scanner(System.in);
        // boolean isContinue = true;
        // do {
        //     int max = 0, min = 0;
        //     double sum = 0;
        //     System.out.print("Enter Total Number[2 to 12] :  ");
        //     double total_num = sc.nextInt();
        //     if (total_num < 2 || total_num > 12) {
        //         System.out.println("Invalid number");
        //         isContinue = false;
        //     } else {
        //         System.out.print("Enter number : ");
        //         for (int i = 1, num; i <= total_num; i++, sum += num) {
        //             num = sc.nextInt();
        //             if (i == 1) {
        //                 max = num;
        //                 min = num;
        //             } else {
        //                 if (num > max) {
        //                     max = num;
        //                 } else if (num < min) {
        //                     min = num;
        //                 }
        //             }
        //         }
        //         double mean = sum / total_num;
        //         System.out.println("Max : " + max);
        //         System.out.println("Min : " + min);
        //         System.out.println("Mean : " + mean);
        //     }
        // } while(isContinue);
        // System.out.println("Bye Bye !!!");

        // --------------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        int SecretNumber = (int) (Math.random() * 100), count = 0;
        // System.out.println("Test " + SecretNumber);
        boolean isContinue = true;
        System.out.println("key in your guress number: ");
        do {
            int number = sc.nextInt();
            count++;
            if (number == SecretNumber) {
                System.out.println("Congratulation! " + SecretNumber + " is secret number");
                System.out.println("You got it in " + count + " trails!");
                isContinue = false;
            } else if (number < SecretNumber) {
                System.out.println("Try higher");
            } else {
                System.out.println("Try lower");
            }
        } while(isContinue);
    }
}