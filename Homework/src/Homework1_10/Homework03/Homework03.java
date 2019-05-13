package Homework1_10.Homework03;
//Задание
//Введите число с клавиатуры в консоль JVM. Определите, является ли последняя
//цифра числа семеркой. Выведите ответ в консоль.

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        boolean w = true;

        while (w == true) {
            System.out.println("Введите целое число ");
            String q = scanner.nextLine();
            try {
                a = Integer.parseInt(q);
                w = false;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введенное число не целое");
            }
        }
        if (a % 10 == 7)
            System.out.println("Последняя цифра семерка");
        else
            System.out.println("Последняя цифра не семерка");
    }
}
