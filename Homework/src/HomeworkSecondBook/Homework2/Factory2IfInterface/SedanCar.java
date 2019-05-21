package HomeworkSecondBook.Homework2.Factory2IfInterface;

public class SedanCar implements Car {

    @Override
    public CarType getModel() {
        return CarType.SEDAN;
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
        System.out.println("Склепали новое Седановое авто");
    }
}
