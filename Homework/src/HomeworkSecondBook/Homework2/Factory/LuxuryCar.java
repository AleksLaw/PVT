package HomeworkSecondBook.Homework2.Factory;

public class LuxuryCar extends Car{

    public LuxuryCar(CarType model) {
        super(model);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Склепали новое Люксовое авто");
    }
}
