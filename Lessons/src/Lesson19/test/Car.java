package Lesson19.test;

public class Car {

    private String VIN = "VIN_NUMBER";

    protected int manufactureYear;

    public Double price = 100_000.0;


    public Car() {
        System.out.println("Car()");
    }

    @OneArgumentConstructor
    Car(String VIN) {
        this.VIN = VIN;
        System.out.println("Car(VIN)");
    }

    private Car(String VIN, int manufactureYear, Double price) {
        this.VIN = VIN;
        this.manufactureYear = manufactureYear;
        this.price = price;
        System.out.println("Car(VIN, year, price)");
    }

    public Double showPrice() {
        System.out.println("Price: " + price);
        return price;
    }

    protected void openDoor(String key) {
        System.out.println("openDoor: " + key);
    }

    private void drive() {
        System.out.println("Driving...");
    }

    static String getType() {
        return Car.class.getCanonicalName();
    }

    @Override
    public String toString() {
        return "Car{" +
                "VIN='" + VIN + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", price=" + price +
                '}';
    }
}