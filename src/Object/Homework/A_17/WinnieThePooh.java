package Object.Homework.A_17;

public class WinnieThePooh {
    public static void main(String[] args) {
        Tiger t = new Tiger("Tiger", 4);
        t.printName();
        System.out.println(t.canWalkWithTwoLegs());

        Bear b = new Bear("Bear", 2);
        b.printName();
        System.out.println(b.canWalkWithTwoLegs());

        Pig p = new Pig("Pig", 4);
        p.printName();
        System.out.println(p.canWalkWithTwoLegs());

        Donkey d = new Donkey("Dockey", 4);
        d.printName();
        System.out.println(d.canWalkWithTwoLegs());
    }
}
