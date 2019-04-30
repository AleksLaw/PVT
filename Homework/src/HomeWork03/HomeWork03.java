package HomeWork03;
//Задание
//Введите число с клавиатуры в консоль JVM. Определите, является ли последняя
//цифра числа семеркой. Выведите ответ в консоль.

import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число ");
        String q = scanner.nextLine();
        int a = Integer.parseInt(q);
        if (a % 10 == 7)
            System.out.println("Последняя цифра семерка");
        else
            System.out.println("Последняя цифра не семерка");


    }
}
