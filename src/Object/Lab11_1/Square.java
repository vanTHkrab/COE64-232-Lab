package Object.Lab11_1;

public class Square extends Shape {
    private double width;

    public Square(double width, String color) {
        super(color);
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return width * 4;
    }
    
    public String toString() {
        return "width: " + (int)this.width + "\nArea: " + getArea() + " Perimeter: " + getPerimeter();
    }
    
    public int compareTo(Object other) {
        return Double.compare(this.getArea(), width);
    }

    public void resize(int percent) {
        width =  (percent / 100.0);
    }

}
