public class PrintEven {
    public static void main(String[] args) {
        for (int i = 1, t = 0, n = 2; i <= 10; i++, t++, n += 2) {
            System.out.print(n + " ");
            if (t == 4) {
                System.out.println();
                t = -1;
            }
        }
    }
}
