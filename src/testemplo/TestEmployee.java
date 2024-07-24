package testemplo;

public class TestEmployee {
    public static void main(String[] args) {
        Employees emp1 = new Employees();
        Employees emp2 = new Employees();
        emp1.insert(101, "John", 50000);
        emp2.insert(102, "David", 55000);
        emp1.display();
        emp2.display();
    }
}
