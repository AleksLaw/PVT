package Homework08;

//Задание
//Используя цикл while, рассчитайте для введенного числа его факториал.

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numder");
        String q = scanner.nextLine();

        int a = Integer.parseInt(q);
        int b = 1;
        int i = 1;
        while (i <= a) {
            b = b * i;
            i++;
        }
        System.out.println("Факториал числа " + a + " равен " + b);

    }

}


