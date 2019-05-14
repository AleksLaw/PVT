package HomeworkFirstBook.Homework1_16.Homework05;
//Задание
//Имеется целое число (любое), это число — сумма денег в рублях.
//Вывести это число, добавив к нему слово «рублей» в правильном падеже.
//Используйте if и else

import java.util.Scanner;

public class Homework05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean w = true;
        int a = 0;

        while (w == true) {
            try {
                System.out.println("Введите число");
                String q = scanner.nextLine();
                a = Integer.parseInt(q);
                w = false;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введенное число не целое");
            }
        }

        int x = Math.abs(a) % 100;
        int y = Math.abs(a) % 10;

        if (x > 10 && x < 20 || y > 5 && y < 10)
            System.out.println(a + " рублей");
        else if (x > 1 && x < 5 || y > 1 && y < 5)
            System.out.println(a + " рубля");
        else
            System.out.println(a + " рубль");


    }
}
