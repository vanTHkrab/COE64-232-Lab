import java.util.Scanner;

public class ProductElementMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row and colum: ");
        int rows = sc.nextInt();
        int colums = sc.nextInt();
        System.out.print("Enter start number : ");
        int start_num = sc.nextInt();
        // int matrix[][] = new int[rows][colums];
        long product = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print(start_num + " ");
                product *= start_num;
                start_num++;
            }
            System.out.println();   
        }
        System.out.println("Product : " + product);
    }
}
