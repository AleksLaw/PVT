package Homework01;

//Задание
//Создать новый класс Автомобиль, наделить класс разными свойствами/полями - характеристики автомобиля,
//добавить в класс методы - действия автомобиля. В отдельном классе Homework26 создайте несколько объектов класса
//Автомобиль с разными свойствами и вызовите методы автомобиля симулируя работу автомобиля из реального мира.

public class Main {


    public static void main(String[] args) {
        Car car1 = new Car("red", "bmw", "x6", "gas", 2000, 200);
        System.out.println(car1);
        car1.start();
        car1.driveForvard();
        car1.stop();
        Car car2 = new Car("green", "wv", "bee", "gas", 2001, 20);
        System.out.println(car2);
        car2.start();
        car2.driveForvard();
        car2.stop();
    }
}
