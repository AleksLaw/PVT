package Homework11_20.Homework16;
//Задание
//Создать массив, заполнить случайными числами, распечатать
//перевернуть и еще раз распечатать

public class Homework16 {
    public static void main(String[] args) {
        int marks[] = new int[5];
        int q;


        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println("----------Обычный вид-----------");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        for (int i = 0; i < marks.length/2; i++) {
          q= marks[marks.length-1-i];
            marks[marks.length-1-i]=marks[i];
            marks[i]=q;
        }
        System.out.println("--------Перевернутый вид--------");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("---------------УСЁ---------------");





    }
}
