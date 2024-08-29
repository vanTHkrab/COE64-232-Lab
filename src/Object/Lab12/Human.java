package Object.Lab12;

import java.util.ArrayList;

public class Human {
    private String name;
    private int age;
    ArrayList<SmartPhone> phone = new ArrayList<SmartPhone>();

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addPhone(SmartPhone p) {
        this.phone.add(p);
    }

    public ArrayList<SmartPhone> getPhone() {
        return this.phone;
    }

    public void deletePhone(int index) {
        this.phone.remove(index);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Name: " + this.name + ", Age " + this.age + " has " + this.phone.size() + " SmartPhones";
    }
}
