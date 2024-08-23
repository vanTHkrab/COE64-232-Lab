package Object.Lab11_2;

import java.util.Scanner;

public class TossablObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            Dice dice = new Dice();
            Dice dice1 = new Dice();
            Dice dice2 = new Dice();
            Dice dice3 = new Dice();
            Dice dice4 = new Dice();
        }
        for (int j = 0; j < n; j++) {
            int sum = 0;
            int per = 0;
            for (int i = 0; i < 5; i++) {
                Dice dice = new Dice();
                Dice dice1 = new Dice();
                Dice dice2 = new Dice();
                Dice dice3 = new Dice();
                Dice dice4 = new Dice();
                sum += dice.getNumber() + dice1.getNumber() + dice2.getNumber() + dice3.getNumber() + dice4.getNumber();
                System.out.print(dice.getNumber() + " " + dice1.getNumber() + " " + dice2.getNumber() + dice3.getNumber() + " " + dice4.getNumber());
                if (sum >= 6 && sum <= 12) {
                    System.err.println(" Between 6 And 12" );
                    per += 1;
                } else {
                    System.err.println(" Out of Range" );
                }
            }
            System.out.println("Percentage " + (per * 100 / n) + "%");

        }
        
    }
}
