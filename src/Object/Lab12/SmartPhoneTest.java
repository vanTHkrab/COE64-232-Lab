package Object.Lab12;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhoneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Human> human = new ArrayList<Human>();
        human.add(new Human("AAA", 26));

        human.get(0).addPhone(new SmartPhone("0819866339", "Huawei", "Android"));
        human.get(0).addPhone(new SmartPhone("0868884661", "Iphone", "IOS"));
        human.get(0).addPhone(new SmartPhone("0658997722", "Oppo", "Android"));

        human.add(new Human("BBB", 19));

        human.get(1).addPhone(new SmartPhone("0878884661", "Iphone", "IOS"));
        human.get(1).addPhone(new SmartPhone("0958992222", "Oppo", "Android"));

        printPhone(human.get(0));
        printPhone(human.get(1));

        System.out.println("Select Menu\n1. Add smartphone\n2. Delete smartphone\n3. Exit\n==============");
        int menu = 0;
        do {
            System.out.print("Select Menu: ");
            menu = sc.nextInt();
            String number, brand, os, name;
            switch (menu) {
                case 1:
                    System.out.print("Enter phone info: ");
                    number = sc.next();
                    brand = sc.next();
                    os = sc.next();
                    System.out.print("Enter name: ");
                    name = sc.next();
                    insertPhone(human, name, new SmartPhone(number, brand, os));
                    break;

                case 2:
                    System.out.print("Delete phone number: ");
                    number = sc.next();
                    System.out.print("Enter name: ");
                    name = sc.next();
                    deletePhone(human, name, number);
                    break;

                case 3:
                    System.out.println("Bye Bye !!!");
                    human.clear();
                    break;
            }
            System.out.println();
        } while (menu != 3);
    }

    public static void printPhone(Human h) {
        System.out.println(h);
        for (SmartPhone p : h.getPhone()) {
            System.out.println(p);
        }
    }

    public static void insertPhone(ArrayList<Human> human, String name, SmartPhone p) {
        Human h = null;
        boolean isFound = false;
        for (Human h1 : human) {
            if (h1.getName().equals(name)) {
                isFound = true;
                h = h1;
                for (SmartPhone p1 : h1.getPhone()) {
                    if (p1.getNumber().equals(p.getNumber())) {
                        System.out.println("Duplicate phone number");
                        return;
                    }
                }
                break;
            }
        }
        if (isFound) {
            h.addPhone(p);
            System.out.println("Insert Complete");
            printPhone(h);
        } else {
            System.out.println("Name not found");
        }
    }

    public static void deletePhone(ArrayList<Human> human, String name, String number) {
        boolean isFoundName = false, isFoundNumber = false;
        for (Human h : human) {
            if (h.getName().equals(name)) {
                isFoundName = true;
                for (int i = 0; i < h.getPhone().size(); i++) {
                    if (h.getPhone().get(i).getNumber().equals(number)) {
                        isFoundNumber = true;
                        h.deletePhone(i);
                        System.out.println("Delete Complete");
                        printPhone(h);
                        break;
                    }
                }
                break;
            }
        }
        if (!isFoundName) {
            System.out.println("Name not found");
        } else if (!isFoundNumber) {
            System.out.println("Phone number not found");
        }
    }
}
