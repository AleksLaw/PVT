package Homework28;
//задание
// Создать список оценок с помощью ArrayList, заполнить случайными
//найти максимум с помощью итератора

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Homework28 {
    public static void main(String[] args) {

        int listSize = 40;
        List list = new ArrayList();
        for (int i = 0; i < listSize; i++) {
            list.add((int) (Math.random() * 30 + 1));
        }

        System.out.println("Все оценки учеников: " + list);
        int max = Integer.MIN_VALUE;

        System.out.println("Способ через коллекции  Максимальная оценка=" + Collections.max(list));   //использую для проверки правильности рещения

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            int w = (int) iterator.next();
            if (max < w) {
                max = w;
            }

        }
        System.out.println("Способ через итератор  Максимальная оценка=" + max);
    }
}
