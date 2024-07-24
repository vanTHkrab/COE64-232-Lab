package testemplo;

public class Animal {
    private boolean vegetarian;
    private String color;
    private int noOfLegs;

    public Animal() {

    }

    public Animal(boolean vegetarian, String color, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.color = color;
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
