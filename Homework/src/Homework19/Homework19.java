package Homework19;
//Задание
// Посчитать слова, не учитывать пробелы в начале и конце и двойные пробелы
public class Homework19 {
    public static void main(String[] args) {
        int count = 1;

        String q = " «Ничего  ты           не знаешь, Джон  Сноу!  вздохнула    она и умерла.»       ";

        while (q.contains("  ")) {
            String s = q.replace("  ", " ");
            q = s;
        }

        String w = q.trim();

        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println(w);
        System.out.println("Количество слов = " + count + ".");
    }
}



