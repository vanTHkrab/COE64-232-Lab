import java.util.Scanner;
public class ManhattanDistance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Manhattan Distance");
        System.out.print("P1 (x1, y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("P2 (x2, y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int M_Distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        System.out.println("Manhattan Distance: " + M_Distance);
    }
}