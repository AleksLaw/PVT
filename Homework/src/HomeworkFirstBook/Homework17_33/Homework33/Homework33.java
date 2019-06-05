package HomeworkFirstBook.Homework17_33.Homework33;
// Задание
// Вывести список файлов и катологов выбранного каталого на диске. Используя Thread
// Написал для двух потоков, Не очень понимаю условия задачи.

import java.io.File;

public class Homework33 implements Runnable {
    static String dir = "c:/Windows";
    volatile File folder = new File(dir);
    volatile File[] listOfFiles;
    private boolean isDirBusy = true;
    private boolean isFileBusy = true;


    private synchronized void getFile(File[] d) {
        try {
            while (isDirBusy) {

                for (int i = 0; i < d.length; i++) {
                    if (d[i].isFile()) {
                        System.out.println("Файл " + d[i].getName() + "   " + Thread.currentThread().getName());
                    }
                }
                isDirBusy = false;
                break;
            }
        } catch (Exception e) {
            System.out.println(  "Нет такого каталога");
        }
    }

    private synchronized void getDir(File[] s) {
        try {
            while (isFileBusy) {

                for (int i = 0; i < s.length; i++) {
                    if (s[i].isDirectory()) {
                        System.out.println("Каталог " + s[i].getName() + "   " + Thread.currentThread().getName());
                    }
                }
                isFileBusy = false;
                break;
            }
        } catch (Exception e) {
            System.out.println(  "Нет такого каталога");
        }
    }

    public static void main(String[] args) {
        new Thread(new Homework33()).start();
        new Thread(new Homework33()).start();
    }


    @Override
    public void run() {
        listOfFiles = folder.listFiles();



        if (Thread.currentThread().getName().equals("Thread-0")) {
            getDir(listOfFiles);
        } else {
            getFile(listOfFiles);
        }
    }
}
