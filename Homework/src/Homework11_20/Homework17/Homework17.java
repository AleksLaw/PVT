package Homework11_20.Homework17;
//Задание
// Создать двумерный массив в виде бабочки

public class Homework17 {
    public static void main(String[] args) {
        int bat[][] = new int[5][5];
        int i, j;

        for (i = 0; i < bat.length / 2; i++) {
            for (j = 0; j < bat[i].length; j++) {
                if ((j < i) || (j >= (bat[i].length - i)))
                    bat[i][j] = 0;
                else
                    bat[i][j] = 1;
            }
        }
        for (i = bat.length - 1; i >= bat.length / 2; i--) {
            for (j = 0; j < bat[i].length; j++) {
                if ((j < (bat[i].length - 1 - i)) || (j > i))
                    bat[i][j] = 0;
                else
                    bat[i][j] = 1;
            }
        }
        for (i = 0; i < bat.length; i++) {
            for (j = 0; j < bat[i].length; j++) {
                System.out.print(bat[i][j]);
            }
            System.out.println(" ");
        }
    }


}

