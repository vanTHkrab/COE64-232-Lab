package Object.Homework.A_19;

import java.util.*;

public class AggregationDemo {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Paul");


        Mobile number1 = new Mobile();
        number1.setMobileNo("8868923136");

        Mobile number2 = new Mobile();
        number2.setMobileNo("8630023310");

        ArrayList<Mobile> numberList = new ArrayList<Mobile>();
        numberList.add(number1);
        numberList.add(number2);

        person.setNumbers(numberList);

        System.out.print(person.getNumbers().get(0).getMobileNo() + " ");
        System.out.print(person.getNumbers().get(1).getMobileNo());
        System.out.println(" are mobile numbers of the person " + person.getName());
    }
}