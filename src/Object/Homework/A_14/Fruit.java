package Object.Homework.A_14;

public class Fruit {
    private String color;
    private int size;
    private double weight;
    String taste;

    public Fruit() {
    }

    public Fruit(String color, int size, double weight) {
        this.color = color;
        this.size = size;
        this.weight = weight;
    }

    public String toString(){

        return color +  " " + size +  " " + weight + " " + taste;

    }  
}
