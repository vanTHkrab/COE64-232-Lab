package test.A;

public class Square extends Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.width;
    }

    public double getPerimeter() {
        return 4 * this.width;
    }

    public String toString() {
        return "Width: " + this.width;
    }

    public int compareTo(Object other) {
        return Double.compare(this.getArea(), ((Square)other).getArea());
    }

    public void resize(int percent) {
        this.width = this.width * (percent / 100.0);
    }
}
