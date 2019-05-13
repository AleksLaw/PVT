package Homework11_20.Homework13;
//Задание
//Определить является ли число простым используя break;

public class Homework13 {
    public static void main(String[] args) {

        int a = 2;
        if (a > 0) {
            boolean type = true;
            for (int p = 2; p < a; p++) {
                if (a % p == 0) {
                    type = false;
                    break;
                }
            }
            if (type) {
                System.out.println("Число является простым");
            } else {
                System.out.println("Число не является простым");
            }
        } else {
            System.out.println("Число отрицательное, введите положительное целое число");
        }
    }
}
