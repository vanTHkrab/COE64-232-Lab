package Object.A_14_2;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[3];
        v[0] = new Car("Toyota", "Red", 2015, "Camry", "Sedan");
        v[1] = new Car("Honda", "Blue", 2016, "Accord", "Sedan");
        v[2] = new Car("Ford", "Black", 2017, "Fusion", "Sedan");
    
        v[0].printDetails();
        v[1].printDetails();
        v[2].printDetails();
    }

}
