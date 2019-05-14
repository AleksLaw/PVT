package HomeworkFirstBook.Homework17_33.Homework32;
//Задание
//1 Записать в двоичный файл 20 случайных чисел 2 Прочитать файл 3 Распечатать 4 найти среднее арифметическое

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Homework32 {
    public static void main(String[] args) {
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream;
        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("digital20.txt")));
            for (int i = 0; i < 10; i++) {
                dataOutputStream.writeDouble(Math.random() * 10);
            }
            dataOutputStream.flush();
            dataOutputStream.close();
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("digital20.txt")));//получение текста из файла
            List<Double> list= new ArrayList<Double>();
            while (true) {
                try {
                     list.add(dataInputStream.readDouble());
                } catch (EOFException e) {
                    break;
                }
            }
            dataInputStream.close();
            for (double a:list) {
                System.out.print(a+"  ");
            }
            int count=0;
            double summ=0;

                for (int i=0; i<list.size();i++){
                    summ+=list.get(i);
                    count++;
                }
            System.out.println("\n"+"Среднее арифметическое = " + summ/count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
