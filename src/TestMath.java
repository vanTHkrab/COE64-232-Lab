import java.util.Scanner;

public class TestMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("P1 (x1, y1): ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        System.out.print("P2 (x2, y2): ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        int manhattanDistance = Math.abs(x1 - x2) + Math.abs(y1 - y2);

        System.out.println("Manhattan distance: " + manhattanDistance);

    }
}
