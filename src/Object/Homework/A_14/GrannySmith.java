package Object.Homework.A_14;

/**
 * GrannySmith
 */
public class GrannySmith extends Fruit{
    public GrannySmith (){
    }

    public GrannySmith(String color, int size, double weight) {
        super(color, size, weight);
        this.taste = "sour";
    }
}