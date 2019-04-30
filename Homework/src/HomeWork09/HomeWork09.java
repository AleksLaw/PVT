package HomeWork09;
//Имеется последовательность чисел найти минимум и максимум

public class HomeWork09 {
    public static void main(String[] args) {

        int x = (int) (Math.random() * 20);
        int min = x;
        int max = x;

        while (x != 0) {

            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }

            x = (int) (Math.random() * 20);

        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }
}