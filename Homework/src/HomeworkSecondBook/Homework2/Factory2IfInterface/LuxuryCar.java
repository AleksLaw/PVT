package HomeworkSecondBook.Homework2.Factory2IfInterface;

public class LuxuryCar implements Car {

    @Override
    public CarType getModel() {
        return CarType.LUXURY;
    }

    @Override
    public void setModel(CarType model) {

    }

    @Override
    public Car car(CarType model) {
        return car(model);
    }

    @Override
    public void construct() {
        System.out.println("Склепали новое Люксовое авто");
    }
}
