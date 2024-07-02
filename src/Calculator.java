import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculator (+, -, *, /, %)");
        System.out.println("==============================");
        System.out.println("Press +: Add");
        System.out.println("Press -: Subtract");
        System.out.println("Press *: Multiply");
        System.out.println("Press /: Divide");
        System.out.println("Press %: Modulo\n");
        System.out.print("Press operator: ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
            case '-':
            case '*': 
            case '/': 

            
            case '%': 
                System.out.print("Please enter x: ");
                int x = sc.nextInt();
                System.out.print("Please enter y: ");
                int y = sc.nextInt();
                System.out.println(x + " " + operator + " " + y + " = " + ((operator == '+') ? x + y : (operator == '-') ? x - y : (operator == '*') ? x * y : (operator == '/') ? x / y : x % y) + "\n");
                break; 
            default:
            System.out.println("Invalid operator\n");
            break;
        };
        System.out.println("Bye Bye !!!");
    }


}   

             