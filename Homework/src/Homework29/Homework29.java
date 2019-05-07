package Homework29;
//Задание имеется текст Составить частотный словарь

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework29 {
    public static void main(String[] args) {


        char[] znak = {'.', ',', ':', ';', '?', '!', '(', ')', '-', '«', '»'};
        String sad = "раз два раз два раз два раз два 1 1 1 1 2 2 3 3 3 4 4 4 4 , , ,  ";
        String s = sad.toLowerCase();

        char[] text = s.toCharArray();
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < znak.length; j++) {
                if (text[i] == znak[j]) {
                    text[i] = ' ';
                }
            }
        }
        String b = new String(text);


        while (b.contains("  ")) {   //замена 2 пробела на 1
            String e = b.replace("  ", " ");
            b = e;
        }

        String w = b.trim(); //первый и последний пробел

        List listStart = new ArrayList();
        Set setDifferentWord = new HashSet();
        List listFinish = new ArrayList();

        String[] words = w.split("\\s"); // Разбиение строки на слова с помощью разграничителя (пробел)
        // Вывод на экран
        for (int i = 0; i < words.length; i++) {
            listStart.add(words[i]);
        }


        setDifferentWord.addAll(listStart);
        listFinish.addAll(setDifferentWord);

        int count = 0;
        for (int i = 0; i < listFinish.size(); i++) {
            for (int j = 0; j < listStart.size(); j++) {
                if (listFinish.get(i).equals(listStart.get(j))) {

                    count++;
                }

            }
            System.out.println(listFinish.get(i) + "    " + count);
            count = 0;
        }


    }
}

