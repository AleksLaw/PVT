package HomeWork3_1;
//Задание
//public static void main(String[] args) {
//        int s = 3700;
//        int sec;
//        int m;
//        int min, h;
//        sec = s % 60;
//        m = (s -sec) / 60;
//        min = m % 60;
//        h = (m -min) / 60;
//        System.out.println(h+" часов" + min + " минут" + sec + " секунд");
//        }
//Продолжите приведенный пример, добавьте расчет и вывод суток и недель.

public class HomeWork3_1 {
    public static void main(String[] args) {
        int s = 907280;
        int sec, min, hour, day, week;
        int m,h,d;

        sec = s % 60;
        m = (s -sec) / 60;
        min = m % 60;
        h = (m -min) / 60;
        hour=h%24;
        d = (h-hour)/24;
        day = d%7;
        week = d/7;
        System.out.println( week+ " week "+ day + " day " +hour+" hour " + min + " min " + sec + " sec");
        }
}
