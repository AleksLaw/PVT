package HomeworkSecondBook.Homework2.FactoryIfClass;

public class SmallCar extends Car{

    public SmallCar(CarType model) {
        super(model);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Склепали новое Малюсенькое авто");
    }
}
