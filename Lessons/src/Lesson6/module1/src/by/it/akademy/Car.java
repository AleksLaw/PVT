package Lesson6.module1.src.by.it.akademy;

class Engine extends Object {
    void start(){}
}

final class DieselEngine extends Engine {
    final void start() {}
}

public class Car {

    public void openDoor(){}

    protected void openWindow() {}

    void startEngine() {}

    private void checkOilLevel() {}

    final Engine engine;

    static String CAR_NAME = "BMW";

    public Car(String plateNumber) {
        this.engine = new DieselEngine();
        this.plateNumber = plateNumber;

        final String s;
        s = "new s";

    }

    String plateNumber;

    static void printCheck(String checkNr) {
        System.out.println(CAR_NAME
                + " " + checkNr);
    }

    void printInvoice(String invoiceNum) {
        System.out.println(plateNumber +
                " Invoice number=" + invoiceNum);
    }

    public static void main(String[] args) {
        Car car1 = new Car("1234 BY-7");
        System.out.println(car1.CAR_NAME);
        car1.CAR_NAME = "lada kalina";
        car1.printInvoice("Inv 1");

        Car car2 = new Car("5678 BY-5");
        System.out.println(car2.CAR_NAME);
        car2.printInvoice("Inv 2");

        System.out.println(Car.CAR_NAME);
        Car.CAR_NAME = "lada kalina";

        car1.printCheck("Check 1");
        car2.printCheck("Check 1");

    }
}
