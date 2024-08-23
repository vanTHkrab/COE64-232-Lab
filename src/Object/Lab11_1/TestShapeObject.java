package Object.Lab11_1;

import java.util.ArrayList;

public class TestShapeObject {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        shapes.add(new Square(4, "Orange"));
        shapes.add(new Square(10, "Orange"));
        shapes.add(new Square(5, "Orange"));
        
        shapes.add(new Circle(3, "Violet"));
        shapes.add(new Circle(6, "Violet"));
        shapes.add(new Circle(10, "Violet"));

        displayAllShape(shapes);
        int ansmaxindex[] = findMax(shapes);
        int ansminindex[] = findMin(shapes);

        System.out.println(ansmaxindex[1] + " " + shapes.get(ansmaxindex[1]).getArea());
        System.out.println(ansminindex[1] + " " + shapes.get(ansminindex[1]).getArea());
        System.out.println();
        System.out.println(ansmaxindex[0] + " " + shapes.get(ansmaxindex[0]).getArea());
        System.out.println(ansminindex[0] + " " + shapes.get(ansminindex[0]).getArea());


        shapes.get(1).resize(2000);
        shapes.get(4).resize(300);
        System.out.println("After resize");
        displayAllShape(shapes);
        System.out.println("==========================================");
        System.out.println("Compare 2 Squares after resize");
        if(shapes.get(0).compareTo(0) < shapes.get(1).compareTo(1)) {
            System.out.println("Square 1 is smaller then Square 2");
        } else if(shapes.get(0).compareTo(0) > shapes.get(1).compareTo(1)) {
            System.out.println("Square 1 is biger then Square 2");
        } else {
            System.out.println("Square 1 is equal to Square 2");
        }
        if(shapes.get(3).compareTo(3) < shapes.get(4).compareTo(4)) {
            System.out.println("Circle 1 is smaller then Circle 2");
        } else if(shapes.get(3).compareTo(3) > shapes.get(4).compareTo(4)) {
            System.out.println("Circle 1 is biger then Circle 2");
        } else {
            System.out.println("Circle 1 is equal to Circle 2");
        }

 
    }

    public static int[] findMax(ArrayList<Shape> shapes) {
        double maxPerimeter = Double.MIN_VALUE;
        double minCircum = Double.MIN_VALUE;
        int arr[] = {0, 0};

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Square) {
                Square square = (Square) shapes.get(i);
                double perimeter = square.getPerimeter();
                if (perimeter > maxPerimeter) {
                    maxPerimeter = perimeter;
                    arr[1] = i;
                }
            } else {
                Circle circle = (Circle) shapes.get(i);
                double circumference = circle.getCircumference();
                if (circumference > minCircum) {
                    minCircum = circumference;
                    arr[0] = i;
                }
            }
        }
        return arr;
    }

    public static int[] findMin(ArrayList<Shape> shapes) {
        double maxCircumference = Double.MAX_VALUE;
        double maxPerimeter = Double.MAX_VALUE;
        int arr[] = {0, 0};

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                Circle circle = (Circle) shapes.get(i);
                double circumference = circle.getCircumference();
                if (circumference < maxCircumference) {
                    maxCircumference = circumference;
                    arr[0] = i;
                }
            } else {
                Square square = (Square) shapes.get(i);
                double perimeter = square.getPerimeter();
                if (perimeter < maxPerimeter) {
                    maxPerimeter = perimeter;
                    arr[1] = i;
                }
            }
        }

        return arr;
    }

    public static void displayAllShape(ArrayList<Shape> shapes) {
        int i = 1;
        System.out.println("class Square");
        for (Shape shape : shapes) {
            if (i == 4) {
                i = 1;
                System.out.println("=========================");
                System.out.println("class Circle");
            }
            System.out.println((i++) + ". Color: " + shape.color + ", " + shape);
        }
    }
}