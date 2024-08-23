package Object.Lab11_2;

public class Dice {
    private int number;
    public Dice() {
        toss();
    }

    public void toss() {
        number = (int)Math.random() * 6 + 1;
    }

    public int getNumber() {
        return number;
    }
}
