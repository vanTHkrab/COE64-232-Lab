package Object.Homework.A_18;
import java.util.*;

public class Employee implements Comparable<Employee> {

    String firstName;
    String lastName;

    // Constructor sets firstName and lastName
    public Employee(String first, String last)  {
        this.firstName = first;
        this.lastName = last;
    }

    // User-friendly output when printed
    public String toString()  {
        return "( " + this.lastName + ", " + this.firstName + " )";
    }

    // Implement the Comparable interface
    @Override
    public int compareTo(Employee other)  {
        if (this.lastName.compareTo(other.lastName) != 0) {
            // If lastNames are different, compare lastName
            return this.lastName.compareTo(other.lastName);
        } else {
            // If lastNames are the same, compare firstName
            return this.firstName.compareTo(other.firstName);
        }
    }
}