package Homework21;
//Задание
// 2 цикла многократно склатывающие строки один через String
// второй через Builder метод append. Сравнить скорость выполнения.

public class Homework21 {
    public static void main(String[] args) {
        String a = "Асталависта, мешок с костями!";
        int q = 10000;
        long startTimeString = System.currentTimeMillis();
        for (int i = 0; i < q; i++) {
            a += "Асталависта, мешок с костями!";
        }
        long endTimeString = System.currentTimeMillis();

        long startTimeBuilder = System.currentTimeMillis();
        for (int i = 0; i < q; i++) {
            StringBuilder strBuilder = new StringBuilder();
            strBuilder.append("Асталависта, мешок с костями!");
        }
        long endTimeBuilder = System.currentTimeMillis();

        long startTimeBuffer = System.currentTimeMillis();
        for (int i = 0; i < q; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Асталависта, мешок с костями!");
        }
        long endTimeBuffer = System.currentTimeMillis();

        System.out.println("Время выполнения String = " + (endTimeString - startTimeString) + " ms");
        System.out.println("Время выполнения Builder = " + (endTimeBuilder - startTimeBuilder) + " ms");
        System.out.println("Время выполнения Buffer = " + (endTimeBuffer - startTimeBuffer) + " ms");



    }
}
