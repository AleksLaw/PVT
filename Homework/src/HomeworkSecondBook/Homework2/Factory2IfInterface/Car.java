package HomeworkSecondBook.Homework2.Factory2IfInterface;

public interface Car {

    CarType model = null;

    CarType getModel();

    void setModel(CarType model);

    public Car car(CarType model);

    void construct();
}
