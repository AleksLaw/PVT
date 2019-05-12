package Homework30;
//Задание
//1 Создать файл с текстом, 2 прочитать, посчитать колво знаков препинания, 3 посчитать колво слов.

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework30 {
    public static void main(String[] args) {
        String text = "Мы, белорусы — мирные люди,\n" +
                "Сердцем преданные родной земле.\n" +
                "Искренне дружим, силы закаляем,\n" +
                "Мы в трудолюбивой, свободной семье.\n" +
                "\n" +
                "Славься, земли нашей светлое имя,\n" +
                "Славься, народов братский союз!\n" +
                "Наша любимая мать-Отчизна,\n" +
                "Вечно живи и крепчай, Беларусь!\n" +
                "\n" +
                "Вместе с братьями храбро веками\n" +
                "Мы защищали родной порог,\n" +
                "В битвах за свободу, битвах за судьбу\n" +
                "Свое добывали знамя побед!\n" +
                "\n" +
                "Славься, земли нашей светлое имя,\n" +
                "Славься, народов братский союз!\n" +
                "Наша любимая мать-Отчизна,\n" +
                "Вечно живи и крепчай, Беларусь!\n" +
                "\n" +
                "Дружба народов — сила народов —\n" +
                "Наш заветный, солнечный путь.\n" +
                "Гордо ж возвейся в ясные выси,\n" +
                "Знамя победное — радости флаг!\n" +
                "\n" +
                "Славься, земли нашей светлое имя,\n" +
                "Славься, народов братский союз!\n" +
                "Наша любимая мать-Отчизна,\n" +
                "Вечно живи и крепчай, Беларусь!";

        BufferedWriter bufferedWriter;
        BufferedReader bufferedReader;
        int count = 0;
        int countForWord = 0;

        {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter("GimnRB.txt"));
                bufferedWriter.write(text);
                bufferedWriter.flush();
                bufferedWriter.close();
                bufferedReader = new BufferedReader(new FileReader("GimnRB.txt"));
                String readLine;
                String textOut = "";
                String space = " ";
                while ((readLine = bufferedReader.readLine()) != null) {
                    System.out.println(readLine);
                    textOut += space + readLine;
                }
                Pattern pattern = Pattern.compile("[\\(\\)\\{\\}\\[\\]\\^\\$\\|\\?\\*\\+\\.\\\\\\/\\,\\-\\_\\—\\!\\'\\:\\;\\«\\»]");
                Matcher matcher = pattern.matcher(textOut);
                while (matcher.find()) {
                    count++;
                }
                textOut = matcher.replaceAll(space);
                while (textOut.contains("  ")) {   //замена 2 пробела на 1
                    String s = textOut.replace("  ", " ");
                    textOut = s;
                }
                char qw = ' ';
                String textForWord = textOut.trim();
                if (textForWord.length() > 0) { //проверка есть ли вообще слова
                    countForWord = 1;
                }
                for (int i = 0; i < textForWord.length(); i++) {
                    if (textForWord.charAt(i) == ' ') {
                        countForWord++;
                    }
                }
                System.out.println("\n" +count + " знаков препинания" + "\n" + countForWord + " кол-во слов");


            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
