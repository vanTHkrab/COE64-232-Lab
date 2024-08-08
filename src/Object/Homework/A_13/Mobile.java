package Object.Homework.A_13;

public class Mobile {
    private String brand;
    private String model;
    private int price;
    private String phoneNumber;	

    public Mobile() {
    }

    public Mobile(String brand, String model, int price, String phoneNumber) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.phoneNumber = phoneNumber;
    }

    public int getPrice() {
        return this.price;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String toString() {
        return this.brand + ", " + this.model + ", " + this.price + ", " + this.phoneNumber;
    }
}
