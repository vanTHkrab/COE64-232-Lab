import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isFail = false;
        System.out.print("Enter score1 (1-100): ");
        double score1 = sc.nextInt();
        System.out.print("Enter score2 (1-100): ");
        double score2 = sc.nextInt();
        System.out.print("Enter score3 (1-100): ");
        double score3 = sc.nextInt();
        if (score1 < 50 || score2 < 50 || score3 < 50) {
            isFail = true;
        }
        if (isFail){
            System.out.println("Fail");
        } else {
            double average = (score1 + score2 + score3) / 3;
            System.out.println("Mean = " + average);
            if (average <= 65) {
                System.out.println("Grade C");
            } else if(average <= 85){
                System.out.println("Grade B");
            } else{
                System.out.println("Grade A");
            }
        }
    }
}