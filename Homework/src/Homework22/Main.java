package Homework22;
//Задание
// Создать класс и объекты для интервала времени. Свойства интервала: Часы минуты и секунды.
//Методы 1. Полное количество секунд, 2. Сравнение 3. Вывод данных
//Конструкторы 1. Только секунды, 2 Все три параметра
public class Main {
    public static void main(String[] args) {

        Interval interval1 = new Interval(2, 25, 1);
        Interval interval2 = new Interval(5103);

        interval1.compare(interval2);
        interval1.info();
        interval2.info();
        interval1.getTotalSec();
        interval2.getTotalSec();

    }
}
