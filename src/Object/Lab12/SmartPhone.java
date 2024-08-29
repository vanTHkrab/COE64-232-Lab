package Object.Lab12;

public class SmartPhone {
    private String number;
    private String brand;
    private String os;

    public SmartPhone(String number, String brand, String os) {
        this.number = number;
        this.brand = brand;
        this.os = os;
    }

    public String getNumber() {
        return this.number;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getOS() {
        return this.os;
    }

    public String toString() {
        return "Number " + this.number + ", Brand " + this.brand + ", OS " + this.os;
    }
}
