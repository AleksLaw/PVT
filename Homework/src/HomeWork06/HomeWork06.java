package HomeWork06;
//Задание
//Имеются три числа — день, месяц, год. Вывести в виде трех чисел дату следующего дня.
//Постарайтесь испольщовать операторы if, else, или switch

import java.util.Scanner;

public class HomeWork06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год ");
        String q = scanner.nextLine();
        System.out.println("Введите месяц ");
        String w = scanner.nextLine();
        System.out.println("введите день");
        String e = scanner.nextLine();

        int y = Integer.parseInt(q);
        int m = Integer.parseInt(w);
        int d = Integer.parseInt(e);
        if ((d > 29 && m == 2 && y % 4 == 0) || (d > 28 && m == 2 && y % 4 != 0) || (d > 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)) || (d == 30 && (m == 4 || m == 6 || m == 9 || m == 11)) || (m > 12))
            System.out.println("Введена не существующая дата ");
        else if (d == 31 && m == 12)
            System.out.println("Дата следующего дня \n" + "Год " + (y + 1) + " Месяц " + 1 + " День " + 1);
        else if (d == 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10))
            System.out.println("Дата следующего дня \n" + "Год " + y + " Месяц " + (m + 1) + " День " + 1);
        else if (d == 30 && (m == 4 || m == 6 || m == 9 || m == 11))
            System.out.println("Дата следующего дня \n" + "Год " + y + " Месяц " + (m + 1) + " День " + 1);
        else if ((d == 29 && m == 2 && y % 4 == 0) || (d == 28 && m == 2 && y % 4 != 0))
            System.out.println("Дата следующего дня \n" + "Год " + y + " Месяц " + (m + 1) + " День " + 1);
        else
            System.out.println("Дата следующего дня \n" + "Год " + y + " Месяц " + 1 + " День " + (d + 1));
    }
}
