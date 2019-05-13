package Homework1_10.Homework07;
//Задание
//Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
//Проверить помещаются ли эти дома на данном участке.
//Стороны домов — параллельны сторонам участка, в остальном размещение может быть любым.

public class Homework07 {
    public static void main(String[] args) {
        int a = 3, b = 1, c = 1, d = 1, e = 3, f = 3;
        if (a > 0 && b > 0 && c > 0 && d > 0 && e > 0 && f > 0) {
            if ((e >= a + c) && (b <= f && d <= f)) {
                System.out.println("Дома помещаются на участке");
            } else if ((e >= a + d) && (b <= f && c <= f)) {
                System.out.println("Дома помещаются на участке");
            } else if ((e >= b + c) && (a <= f && d <= f)) {
                System.out.println("Дома помещаются на участке");
            } else if ((e >= b + d) && (a <= f && c <= f)) {
                System.out.println("Дома помещаются на участке");
            } else if ((f >= a + c) && (b <= e && d <= e)) {
                System.out.println("Дома помещаются на участке");
            } else if ((f >= a + d) && (b <= e && c <= e)) {
                System.out.println("Дома помещаются на участке");
            } else if ((f >= b + c) && (a <= e && d <= e)) {
                System.out.println("Дома помещаются на участке");
            } else if ((f >= b + d) && (a <= e && d <= c)) {
                System.out.println("Дома помещаются на участке");
            } else
                System.out.println("Дома не помещаются на участке");
        } else System.out.println("Одно из введенных чисел отрицательное");
    }
}