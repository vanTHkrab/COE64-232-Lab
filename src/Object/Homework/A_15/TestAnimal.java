package Object.Homework.A_15;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        Animal c = new Bird();
        displayAnimal(a);
        ((Animal)b).move();
        displayAnimal(b);
        displayAnimal(c);
        ((Animal)c).move();

    }

    public static void displayAnimal(Animal a) {
        if(a instanceof Animal) {
            a.move();
        } else if(a instanceof Dog) {
            ((Dog)a).move();
        } else {
            ((Bird)a).move();
        }
    }
}
