import java.util.Scanner;

public class CoinExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coin Exchange");
        System.out.print("Coin 10 Bath : ");
        int coin10 = sc.nextInt();
        System.out.print("Coin 5 Bath : ");
        int coin5 = sc.nextInt();
        System.out.print("Coin 2 Bath : ");
        int coin2 = sc.nextInt();
        System.out.print("Coin 1 Bath : ");
        int coin1 = sc.nextInt();
        int TotalCoin = (coin10 * 10) + (coin5 * 5) + (coin2 * 2) + coin1;
        System.out.println("Total: " + TotalCoin + " Bath");

        // System.out.println("Bank 1000 Bath: " + (TotalCoin / 1000));
        // TotalCoin %= 1000;

        // System.out.println("Bank 500 Bath: " + (TotalCoin / 500));
        // TotalCoin %= 500;

        // System.out.println("Bank 100 Bath: " + (TotalCoin / 100));
        // TotalCoin %= 100;

        // System.out.println("Bank 50 Bath: " + (TotalCoin / 50));
        // TotalCoin %= 50;

        // System.out.println("Bank 20 Bath: " + (TotalCoin / 20));
        // TotalCoin %= 20;

        System.out.println("Bank 1000 Bath: " + (TotalCoin / 1000));
        TotalCoin %= 1000;

        System.out.println("Bank 500 Bath: " + (TotalCoin / 500));
        TotalCoin %= 500;

        System.out.println("Bank 100 Bath: " + (TotalCoin / 100));
        TotalCoin %= 100;

        int Bank50, Bank20;
        Bank50 = Bank20 = 0;

        if (TotalCoin >= 50) {
            if (TotalCoin % 50 == 0) {
                Bank50 = TotalCoin / 50;
                Bank20 = 0;
            } else if (TotalCoin % 20 == 0){
                Bank50 = 0;
                Bank20 = TotalCoin / 20;
            } else {
                Bank50 = TotalCoin / 50;
                TotalCoin %= 50;
                Bank20 = TotalCoin / 20;
            }
        } else {
            Bank20 = TotalCoin / 20;
        }

        System.out.println("Bank 50 Bath: " + Bank50);
        System.out.println("Bank 20 Bath: " + Bank20);
    }
}
