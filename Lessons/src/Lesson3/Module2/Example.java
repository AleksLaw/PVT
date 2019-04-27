package Lesson3.Module2;

import java.util.Scanner;

/**
 *
 */
public class Example {

    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        String number1 = consoleScanner.nextLine();

        System.out.println("Enter number 2: ");
        String number2 = consoleScanner.nextLine();

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        int sum = num1 + num2;
        System.out.println("Total sum: " + sum);

    }
}