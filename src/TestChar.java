import java.util.Scanner;

public class TestChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Any character: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            switch (ch) {
                case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
                    System.out.println(ch + " is a vowel.");
                    break;
            default:
                System.out.println(ch + " is a consonant.");
                break;
            } 
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a number.");
        } else {
            System.out.println(ch + " is a special character.");
        }

    }
}
