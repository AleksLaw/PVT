package HomeworkFirstBook.Homework1_16.Homework11;
//Задание
//Определить является ли число простым

public class Homework11 {

    public static void main(String[] args) {
        int a = 3;
        boolean type = true;
        if (a > 0) {
            for (int p = 2; p < a; p++) {
                if (a % p == 0) {
                    type = false;
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






