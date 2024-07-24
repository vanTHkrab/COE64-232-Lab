package testemplo;

public class Employees {
    private int id;
    private String name;
    private double salary;

    public Employees() {

    }

    public void insert(int i, String n, double s) {
        this.id = i;
        this.name = n;
        this.salary = s;
    }

    public void display() {
        System.out.println("ID: " + this.id + " Name: " + this.name + " Salary: " + this.salary);
    }
}
