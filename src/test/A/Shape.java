package test.A;

public abstract class Shape implements Comparable, Resizable{
    protected String color;

    public Shape() {}

    public abstract double getArea();

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Color: " + this.color + ", Area: " + this.getArea();
    }
}