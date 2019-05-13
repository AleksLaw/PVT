package Homework33;
// Задание
// Вывести список файлов и катологов выбранного каталого на диске.
// Файлы и каталоги должны быть распечатаны отдельно

import java.io.File;

public class Homework33 {
    public static void main(String[] args) {
        File folder = new File("C:/Windows");
        File[] listOfFiles = folder.listFiles();
        System.out.println("Список файлов");
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("Файл "+ listOfFiles[i].getName());
            }
        }
        System.out.println("\n"+"Список каталогов");
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isDirectory()) {
                System.out.println("Каталог " + listOfFiles[i].getName());
            }
        }
    }
}
