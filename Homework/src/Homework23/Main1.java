package Homework23;

//Задание
//Создать класс банкомат три вида купюр 20 50 100
//методы 1. Добавить купюры 2.Проверка снятия денег 3.Если можно то какими купюрами получишь
// конструктор с 3 параметрами
public class Main1 {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(0, 0, 0);

        bankomat.start();

    }
}
