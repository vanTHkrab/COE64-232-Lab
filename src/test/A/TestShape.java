package test.A;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(3);
        shapes[1] = new Circle(4);
        shapes[2] = new Circle(2);

        shapes[3] = new Square(3);
        shapes[4] = new Square(4);
        shapes[5] = new Square(2);
        displayShape(shapes);

        resizeShape(shapes, 0, 50);

        displayShape(shapes);

        compareShape(shapes, 0, 1);
        compareShape(shapes, 3, 4);
    }

    public static void displayShape(Shape[] shapes) {
        for (Shape i : shapes) {
            System.out.println(i.toString());
        }
    }

    public static void resizeShape(Shape[] shapes, int index,int percent) {
        for (Shape i : shapes) {
            i.resize(percent);
        }
    }

    public static void compareShape(Shape[] shapes, int index1, int index2) {
        if (shapes[index1].compareTo(shapes[index2]) > 0) {
            System.out.println("Shape " + index1 + " is bigger than Shape " + index2);
        } else {
            System.out.println("Shape " + index1 + " is smaller than Shape " + index2);
        }
    }
}
