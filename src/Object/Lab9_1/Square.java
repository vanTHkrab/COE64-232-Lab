package Object.Lab9_1;

public class Square {

    private int width;

    public Square() {

    }

    public Square(int w) {
        this.width = w;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public int getWidth() {
        return this.width;
    }

    public int calArea() {
        return this.width * this.width;
    }

    public int calPerimeter() {
        return this.width * 4;
    }

    public String toString() {
        return "Square width = " + getWidth() + ", Area = " + calArea() + ", Perimeter = " + calPerimeter();
    }
}