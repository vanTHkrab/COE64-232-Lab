import java.util.Scanner;
public class HeaxDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter interger: ");
        int num = sc.nextInt();
        String hex = Integer.toHexString(num);
        System.out.println("Hexadecimal: " + hex);
    }
}




// if (num < 10 ) {
//     System.out.println("HexaDecimal = " + num);
// } else if (num >= 10 && num <= 15) {
//     System.out.println("HexaDecimal = " + (char)(num % 10 + 65));
// } else {
//     System.out.println("Worning number");
// }


