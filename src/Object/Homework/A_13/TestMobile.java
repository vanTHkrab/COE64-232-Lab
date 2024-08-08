package Object.Homework.A_13;


public class TestMobile  {
    public static void main(String[] args) {
        Mobile[] m = new Mobile[2];
        m[0] = new Mobile("Samsung", "Galaxy S21", 20000000, "0909123456");
        System.out.println(m[0]);

        m[1] = new Mobile("Apple", "iPhone 12", 30000000, "0909123457");
        System.out.println(m[1]);

        if (m[0].getPrice() > m[1].getPrice()) {
            System.out.println("Samsung is more expensive than Apple");
        } else {
            System.out.println("Apple is more expensive than Samsung");
        }

        if (m[0].getPhoneNumber().equals(m[1].getPhoneNumber())) {
            System.out.println("The phone numbers are the same");
        } else {
            System.out.println("The phone numbers are different");
        }
    }
}
