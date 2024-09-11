package test.A;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "Radius: " + this.radius;
    }

    public int compareTo(Object other) {
        return Double.compare(this.getArea(), ((Circle)other).getArea());
    }

    public void resize(int percent) {
        this.radius = (int)(this.radius * (percent / 100.0));
    }
}
