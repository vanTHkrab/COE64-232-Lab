package Object.Lab11_2;

import java.util.Scanner;
import java.util.ArrayList;
public class TossablObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Dice> dices = new ArrayList<Dice>();
        do {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int percent = 0;
            for (int i = 0; i < n; i++) {
                for(int j = 0; j < 5; j++) {
                    dices.add(new Dice());
                }
                int sum = 0;
                for (Dice dice : dices) {
                    sum += dice.getNumber();
                    System.out.print(dice.getNumber() + " ");
                }

                if (sum >= 6 && sum <= 12) {
                    System.out.println("Between 6 and 12");
                    percent++;
                } else {
                    System.out.println("Out of range");
                }
                dices.clear();
            }
            System.out.println("Percent: " + (percent * 100 / n) + "%");
            System.out.print("Do you want to continue? (y/n): ");
        } while (sc.next().equals("y"));
    }
}
