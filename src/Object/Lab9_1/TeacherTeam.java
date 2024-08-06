package Object.Lab9_1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TeacherTeam {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher t1 = new Teacher("AAA", 'F', 40, 'M');
        Teacher t2 = new Teacher("BBB", 'M', 51, 'S');
        Teacher t3 = new Teacher("CCC", 'M', 39, 'M');
    
        System.out.println("Teacher Team");
        System.out.println("1. " + t1);
        System.out.println("2. " + t2);
        System.out.println("3. " + t3);
        System.out.println("Average age : " + df.format((float)(t1.getAge() + t2.getAge() + t3.getAge()) / 3));
        
        System.err.println("===== Change status of 3rd teacher =====");
        System.out.print("Enter new status of 3rd teacher: ");
        t3.setStatus(sc.next().charAt(0));

        System.out.println(t3);

        System.out.println("===== Change age of 2nd teacher =====");
        System.out.print("Enter new age of 2nd teacher: ");
        t2.setAge(sc.nextInt());

        System.out.println(t2);
    }


}
