package HomeworkSecondBook.Homework2.Factory;

public class SedanCar extends Car{

    public SedanCar(CarType model) {
        super(model);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Склепали новую машину седанного типа");
    }
}
