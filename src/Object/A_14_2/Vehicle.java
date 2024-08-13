package Object.A_14_2;

public class Vehicle {
    private String make;
    private String color;
    private int year;
    private String model;   

    public Vehicle() {
    }

    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }
}
