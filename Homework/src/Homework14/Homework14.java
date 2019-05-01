package Homework14;
//Задание
//При поиске максимальной оценки вывести не оценку, а ее номер
//Комент При наличии нескольких одинаковых максимальных значений выводится индекс первой встречающейся

public class Homework14 {
    public static void main(String[] args) {
        int marks[] = new int[20];
        int maxIndex = marks[0];
        int index = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > maxIndex) {
                maxIndex = marks[i];
            }

        }
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == maxIndex) {
                index = i;
                break;
            }
        }

        System.out.println("Максимальная оценка " + maxIndex + " Находится на " + index+" месте в списке");

    }
}
