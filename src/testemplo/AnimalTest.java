package testemplo;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal(false, "black", 4);
        System.out.println("Cat is vegetarian? " + a.isVegetarian());
        System.out.println("Cat color is " + a.getColor());
        System.out.println("Cat has " + a.getNoOfLegs() + " legs");

        Animal b = new Animal(true, "white", 4);
        System.out.println("Deer is vegetarian? " + b.isVegetarian());
        System.out.println("Deer color is " + b.getColor());
        System.out.println("Deer has " + b.getNoOfLegs() + " legs");
        
    }
}
