package Lab2;
import java.util.Scanner;

public class TestChoice {
    public static void main(String[] args) {
        int choice, ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a choice [0-2]: "); 
        choice = sc.nextInt();
        switch (choice) {
            case 0: case 1: case 2: ans = choice;
                break;
            default:
                ans = -1;
                break; 
            }
        
        if (ans != -1) {
            System.out.println("Your choice is: " + ans);
        } else {
            System.out.println("Invalid choice");
        }
    }
}