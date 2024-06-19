import java.util.Scanner;

public class DayMonthDemo {
  public static void main( String[] args){
  Scanner in = new Scanner(System.in); 
  System.out.println("Enter number of days");          
  int num = in.nextInt();
  int days = num % 30;
  int month = num / 30;
  System.out.println(num + " days = " + month + " Month and "+ days +" days");
   }
}