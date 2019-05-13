package Homework21_30.Homework26;
//Задание
//Создать список оценок учеником с помощью ArrayList, заполнить случайными оценками
//Удалить неудовлетворительные оценки из списка

import java.util.ArrayList;
import java.util.List;

public class Homework26 {
    public static void main(String[] args) {

        int listPuple = 20;
        Integer badRaiting = 3;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listPuple; i++) {
            list.add((int) (Math.random() * 5 + 1));
        }
        System.out.println("Все оценки учеников: " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= badRaiting) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("Только удовлетворительные оценки: " + list);
    }
}
