package Object.Homework.A_13;

public class Square {
    private double side;
    public Square() {
        side = 1;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * 4;
    }

    public double calculatePerimeter() {
        return side * side;
    }
}
