package HomeworkSecondBook.Homework2.Factory2;

public class SmallCar implements Car {

    @Override
    public CarType getModel() {
        return CarType.SMALL;
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
        System.out.println("Склепали новое Маленькое авто");
    }
}
