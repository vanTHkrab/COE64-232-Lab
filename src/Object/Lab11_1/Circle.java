package Object.Lab11_1;

import java.text.DecimalFormat;

public class Circle extends Shape {
    private static DecimalFormat df = new DecimalFormat("0.000");
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "radius: " + (int)this.radius + "\nArea: " + df.format(getArea()) + " Circumference: " + df.format(getCircumference());
    }

    public int compareTo(Object other) {
        return Double.compare(this.getArea(), radius);
    }

    public void resize(int percent) {
        radius = (percent / 100.0);
    }

}
