package Object.Homework.A_13;

public class SquareTest {
    public static void main(String[] args) {
        int[] side = {4,5,7,8,6,4,10,2,8,6,10,7};

        Square[] sqr = new Square[3];
        for (int i = 0; i < sqr.length; i++) {
            sqr[i] = new Square();
            sqr[i].setSide(side[i]);
        }

        for (int i = 0; i < side.length; i++) {
            System.out.printf("Square %d: side = %d, area = %.2f, perimeter = %.2f\n", i + 1, side[i], sqr[i].calculateArea(), sqr[i].calculatePerimeter());
        }
    }
}
