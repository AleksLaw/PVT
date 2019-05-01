package Homework13;

public class Homework13 {
    public static void main(String[] args) {

        int a = 4;
        boolean type = true;
        for (int p = 2; p < a; p++) {
            if (a % p == 0) {
                type = false;
                break;
            }
        }
        if (type) {
            System.out.println("Число является простым");
        } else {
            System.out.println("Число не является простым");
        }
    }
}
