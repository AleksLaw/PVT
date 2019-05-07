package Homework27;
//Задание
//Создать коллекцию, заполнить случайными числами
//Удалить повторяющиеся числа

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework27 {
    public static void main(String[] args) {

        int listSize = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            list.add((int) (Math.random() * 20 + 1));
        }

        System.out.println("С дубликатами:" +list);

        Set<Integer> listDublicat = new HashSet<>();

        listDublicat.addAll(list); //можно просто распечатать  не возвращая значения в list
        list.clear();
        list.addAll(listDublicat);

        System.out.println("Без дубликатов:" +list);
    }
}
