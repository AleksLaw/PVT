package Homework01;

//Задание
//Создать новый класс Автомобиль, наделить класс разными свойствами/полями - характеристики автомобиля,
//добавить в класс методы - действия автомобиля. В отдельном классе Main создайте несколько объектов класса
//Автомобиль с разными свойствами и вызовите методы автомобиля симулируя работу автомобиля из реального мира.
public class Car {
    private String color, maker, model, engine;
    private int year, speed;

    public Car(String color, String maker, String model, String engine, int year, int speed) {
        this.color = color;
        this.maker = maker;
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.speed = speed;
    }

     public  void start() {
         System.out.println( "Engine start" ) ;
    }
     public  void driveForvard() {
         System.out.println( "Car drive forvard" ) ;
    }
     public  void driveBackward() {
         System.out.println( "Car drive backward" ) ;
    }
     public  void stop() {
         System.out.println( "Engine stop" ) ;
    }





    public String getColor() {
        return color;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", year=" + year +
                ", speed=" + speed;
    }


}



