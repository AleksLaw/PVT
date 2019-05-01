package Homework19;

//Задание
// Посчитать слова, не учитывать пробелы в начале и конце и двойные пробелы
public class Homework19 {
    public static void main(String[] args) {
        int count = 0;

        String q = "       «Ничего  ты           не знаешь, Джон  Сноу!  вздохнула    она и умерла.»       ";


        while (q.contains("  ")) {   //замена 2 пробела на 1
            String s = q.replace("  ", " ");
            q = s;
        }

        String w = q.trim(); //первый и последний пробел

        if (w.length() > 0) { //проверка есть ли вообще слова
            count = 1;
        }
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println(w);
        System.out.println("Количество слов = " + count + ".");
    }
}



