import java.util.Scanner;

public class LoopSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of loop: ");
        int loop = sc.nextInt();
        int smallest = 0;
        for (int i = 0; i < loop; i++) {
            System.out.print("Please enter numbers: ");
            smallest = Integer.MAX_VALUE;
            int num = sc.nextInt();
            for (int j = 0; j < num; j++) {
                System.out.print("No. " + (j + 1) + ": ");
                int small = sc.nextInt();
                if (small < smallest) smallest = small;
            }
            System.out.println(smallest + " is the smallest" );
        }
        
    }
}