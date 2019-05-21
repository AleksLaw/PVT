package HomeworkSecondBook.Homework2.FactoryIfClass;

public abstract class Car {

    private CarType model = null;
    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public Car(CarType model) {
        this.model = model;
    }

    protected abstract void construct();
}
