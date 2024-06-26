package Lab1;
import java.util.Scanner; 
public class DivisibilityBy7 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    int x = in.nextInt();
    int y = in.nextInt();
    boolean isDivisible = (x % 7 == 0)&&(y % 7 == 0);
    System.out.println(isDivisible);
  }
}