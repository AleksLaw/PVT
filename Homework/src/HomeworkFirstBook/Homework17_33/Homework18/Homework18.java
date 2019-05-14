package HomeworkFirstBook.Homework17_33.Homework18;
//Задание
// Посчитать знаки препинания

public class Homework18 {
    public static void main(String[] args) {
        char[] znak = {'.', ',', ':', ';', '?', '!', '(', ')', '-', '«', '»'};
        int count = 0;
        String s = "«Есть только один бог. И его имя Смерть. А Смерти мы говорим лишь одно: «Не сегодня».»";
        System.out.println(s);
        char[] text = s.toCharArray();
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < znak.length; j++) {
                if (text[i] == znak[j]) {
                    count++;
                }
            }
        }
        System.out.println("Количество знаков препинания = "+count+".");
    }
}
