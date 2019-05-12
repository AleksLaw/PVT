package Homework31;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework31 {

    public static void main(String[] args) {
        String text = "По данным судебной статистики в 2018 году за совершение различных преступлений осуждено 993 несовершеннолетних.\\n\" +\n" +
                "        \"Причем 223 из них совершили преступление, находясь в состоянии алкогольного опьянения, 18 – в состоянии наркотического опьянения.\\n\" +\n" +
                "        \"В 2018 году:\\n\" +\n" +
                "        \"За совершение преступлений против мира, безопасности человечества осужден один несовершеннолетний Разжигание расовой, национальной, религиозной либо иной социальной вражды или розни).\\n\" +\n" +
                "        \"За совершение преступлений против жизни и здоровья осуждено 26 несовершеннолетних.\\n\" +\n" +
                "        \"Из них 4 человека 2.245454 осуждены за совершение преступления Убийство. Стоит отметить, что два из них совершили преступление, находясь в состоянии алкогольного опьянения;\\n\" +\n" +
                "        \"8 подростков – за умышленное причинение менее тяжких телесных повреждений ; 8 – за умышленное причинение тяжких телесных повреждений  и 2 – за оставление в опасности;\\n\" +\n" +
                "        \"По одному несовершеннолетнему в категории преступлений против жизни и здоровья осуждены за причинение смерти по неосторожности; \\n\" +\n" +
                "        \"за умышленное причинение легких телесных повреждений; за истязание  и за заражение вирусом иммунодефицита человека.\\n\" +\n" +
                "        \"За совершение преступлений против половой неприкосновенности или половой свободы в 2018 году осуждено 7 несовершеннолетних.\\n\" +\n" +
                "        \"За совершение преступлений против уклада семейных отношений и интересов несовершеннолетних осуждена одна несовершеннолетняя \\n\" +\n" +
                "        \"по ст.  (Уклонение родителей от содержания детей либо от возмещения расходов, затраченных государством на содержание детей, находящихся или находившихся \\n\" +\n" +
                "        \"на государственном обеспечении).";

        BufferedWriter bufferedWriter;
        BufferedReader bufferedReader;

        {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter("Statistica.txt"));//создание файла и запихивание в него текста
                bufferedWriter.write(text);
                bufferedWriter.flush();
                bufferedWriter.close();
                bufferedReader = new BufferedReader(new FileReader("Statistica.txt"));//получение текста из файла
                String readLine;
                String textOut = "";
                String space = " ";
                while ((readLine = bufferedReader.readLine()) != null) {
                    textOut += space + readLine;
                }
                bufferedReader.close();

                List<String> digitalMatch = new ArrayList(); //все числа в Стринге

                Pattern pattern = Pattern.compile("(-?\\d+(\\.?\\d*))");  //Поиск всех чисел
                Matcher matcher = pattern.matcher(textOut);

                while (matcher.find()) {
                    digitalMatch.add(matcher.group());
                }

                List<Double> digital = new ArrayList(); //Приведение Стринг в ИНТ
                for (String a : digitalMatch) {
                    digital.add(Double.parseDouble(a));
                }
                double sum = 0;
                System.out.println("Все числа которые встречаются в тексте");
                for (Double a : digital) {
                    System.out.print(a+" ");
                    sum += a;
                }
                System.out.println("\n" + "Сумма всех чисел = "+sum);

                Set<Double> setDigital = new HashSet<>(); //убирание дубликатов
                setDigital.addAll(digital);
                double sumUnic = 0;
                for (Double a : setDigital) {
                    System.out.print(a+" ");
                    sumUnic+=a;
                }
                System.out.println("\n" + "Сумма уникальных чисел = "+sumUnic +"            //на всякий случай");
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
}



