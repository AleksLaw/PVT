package HomeworkFirstBook.Homework17_33.Homework20;

public class Homework20 {
    //Задание
// Имеется строка с текстом. Вывести текст составленный из последних букв всех слов
    public static void main(String[] args) {

        String q = "Если ты собираешься взять человеческую жизнь, сам загляни в глаза осужденного. " +
                "Ну а если ты не в силах этого сделать, тогда человек, возможно, и не заслуживает смерти»";

        while (q.contains("  ")) {   //замена 2 пробела на 1
            String s = q.replace("  ", " ");
            q = s;
        }
        String w = q.trim(); //первый и последний пробел
        System.out.println(w);
        System.out.println("Вот что получилось");
        for (int i = 0; i < w.length(); i++) {  //'Это чтобы не печатались знаки препинания
            if (w.charAt(i) == ' ') {
                if (w.charAt(i - 1) == '.' || w.charAt(i - 1) == ',' || w.charAt(i - 1) == '!' || w.charAt(i - 1) == ';' || w.charAt(i - 1) == ':') {
                    System.out.print(w.charAt(i - 2));
                } else System.out.print(w.charAt(i - 1));
            }
        }
    }
}
