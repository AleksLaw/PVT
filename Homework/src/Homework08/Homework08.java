package Homework08;

//Задание
//Используя цикл while, рассчитайте для введенного числа его факториал.

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean w = true;
        int a = 0;

        while (w == true) {
            try {
                System.out.println("Введите целое положительное число");
                String q = scanner.nextLine();
                a = Integer.parseInt(q);
                w = false;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введенное число не целое");
            }
        }
        int b = 1;
        int i = 1;
        if (a > 0) {
            while (i <= a) {
                b = b * i;
                i++;
            }
            System.out.println("Факториал числа " + a + " равен " + b);
        } else {
            System.out.println("Ошибка: Введенное число отрицательное");
        }
    }
}


