package HomeWork3_3;

import java.util.Scanner;

//Задание
//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой
//картонкой радиусом r. Используйте класс java.io.Console для ввода значений a, b, r.
public class HomeWork3_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину отверстия ");
        String q = scanner.nextLine();
        System.out.println("Введите ширину отверстия ");
        String w = scanner.nextLine();
        System.out.println("Введите радиус картонки");
        String e = scanner.nextLine();

        int a = Integer.parseInt(q);
        int b = Integer.parseInt(w);
        int r = Integer.parseInt(e);

        double d = Math.sqrt(a * a + b * b);

        if (d <= r)
            System.out.println("Этой картонкой можно закрыть отверстие");
        else
            System.out.println("И отверстие не закроете и картонку потеряете");

    }
}
