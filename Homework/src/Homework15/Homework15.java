package Homework15;
//Задание
//Определить сумму элементов массива расположенной между минимальной и максимальной оценкой


public class Homework15 {
    public static void main(String[] args) {
        int marks[] = new int[20];
        int maxIndex = marks[0];
        int minIndex = 9;
        int indexMax = 0;
        int indexMin = 0;
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > maxIndex) {
                maxIndex = marks[i];
            }
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == maxIndex) {
                indexMax = i;
                break;
            }
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < minIndex) {
                minIndex = marks[i];
            }
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == minIndex) {
                indexMin = i;
            }
        }

        if (indexMax > indexMin) {
            for (int i = indexMin; i <= indexMax; i++) {
                sum += marks[i];
            }
        }

        if (indexMin > indexMax) {
            for (int i = indexMax; i <= indexMin; i++) {
                sum += marks[i];
            }
        }
        System.out.println("Максимальная оценка " + maxIndex + " Находится на " + indexMax + " месте в списке");
        System.out.println("Минимальная оценка " + minIndex + " Находится на " + indexMin + " месте в списке");
        System.out.println("Сумма чисел между минимальным и максимальным" + sum);
    }
}