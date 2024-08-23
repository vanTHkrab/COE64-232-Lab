package Object.Lab11_1;

public abstract class Shape implements Comparable, Resizable {
    protected String color;

    public Shape() {}

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color: " + this.color;
    }
}
