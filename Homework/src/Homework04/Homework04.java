package Homework04;

import java.util.Scanner;

//Задание
//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой
//картонкой радиусом r. Используйте класс java.io.Console для ввода значений a, b, r.
public class Homework04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean w = true;
        int a = 0;
        int b = 0;
        int r = 0;

        while (w == true) {
            try {
                System.out.println("Введите длину отверстия ");
                String q = scanner.nextLine();
                a = Integer.parseInt(q);
                w = false;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введенное число не целое");
            }
        }
        w = true;
        while (w == true) {
            try {
                System.out.println("Введите ширину отверстия ");
                String t = scanner.nextLine();
                b = Integer.parseInt(t);
                w = false;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введенное число не целое");
            }
        }
        w = true;
        while (w == true) {
            try {
                System.out.println("Введите радиус картонки");
                String e = scanner.nextLine();
                r = Integer.parseInt(e);
                w = false;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введенное число не целое");
            }
        }


        double d = Math.sqrt(a * a + b * b);

        if (d <= r)
            System.out.println("Этой картонкой можно закрыть отверстие");
        else
            System.out.println("Этой картонкой нельзя закрыть отверстие");

    }
}
