package Homework10;
//Задание
//Имеется целое число. Следует посчитать сумму цифр данного числа
public class Homework10 {
    public static void main(String[] args) {

        double a = (int) (Math.random() * 1000);
        int x = (int) a;
        System.out.println("x=" + x);
        int sum = 0;
        while (x != 0) {
            sum = sum + x % 10;
            x = x / 10;

        }
        System.out.println("Сумма цифр=" + sum);
    }

}
