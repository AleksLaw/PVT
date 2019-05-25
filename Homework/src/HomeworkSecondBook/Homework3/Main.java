package HomeworkSecondBook.Homework3;
// Задание
// написать программу, которая из двух случайных чисел находит и печатает MIN и MAX,
// алгоритм поиска MIN и MAX реализовать в виде lambda выражений
import java.util.Random;

public class Main {

    public Main() {
    }

    // Я вывихнул себе мозги

    public void print(MinMax minMax) {
        Random random = new Random();
        int a1;
        int a2;
        System.out.println(minMax.minMaxInter(a1 = random.nextInt(100), a2= random.nextInt(100)));
        System.out.println(a1 + " Первое число");
        System.out.println(a2 + " Второе число");

    }

    public static void main(String[] args) {



        Main main = new Main();
        System.out.println("Минимум");
        main.print((a, b) -> {
            int min;
            if (a < b) {
                min = a;
                return min;
            } else if (a == b) {
                System.out.println("Числа равны");
                return 0;
            } else {
                min = b;
                return min;
            }
        });

        System.out.println("Максимум");
        main.print((a, b) -> {
            int max;
            if (a < b) {
                max = b;
                return max;
            } else if (a == b) {
                System.out.println("Числа равны");
                return 0;
            } else {
                max = a;
                return max;
            }
        });
    }
}