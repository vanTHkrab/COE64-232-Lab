package Object.Homework.A_18;


import java.util.ArrayList;
import java.util.Arrays;
public class TestEmployees {
    public static void main(String[] args)  {

        Employee[] a = new Employee[5];
        a[0] = new Employee("Kirk","Douglas");
        a[1] = new Employee("Mel","Brooks");
        a[2] = new Employee("Jane","Fonda");
        a[3] = new Employee("Henry","Fonda");
        a[4] = new Employee("Michael","Douglas");

        Arrays.sort(a);

        for (Employee e : a) {
            System.out.println(e);
        }
    }
}
