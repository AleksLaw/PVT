package Lesson4.photomat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isRunning = true;
        Machine machine = new Machine();
        while (isRunning) {
            System.out.println("Please select commands:");
            System.out.println("Make photo [F]; Insert money [M] or Exit [exit]");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            switch (command) {
                case "F": {
                    System.out.println("You have selected photo.");
                    machine.makePhoto();
                    break;
                }
                case "M": {
                    enterBanknotes(machine, scanner);
                    machine.countBankNotes();
                    break;
                }
                case "exit": {
                    isRunning = false;
                    break;
                }
                default: {
                    System.out.println("Your command is wrong");
                    break;
                }
            }
        }
        System.gc();
        System.out.println("Program exit");
        System.exit(0);
    }

    private static void enterBanknotes(Machine machine, Scanner scanner) {
        do {
            System.out.println("Please insert banknote [5] [10] [20] BYN or [cancel]");
            String bankNotes = scanner.nextLine();
            if ("cancel".equals(bankNotes)) break;

            int bankNoteAmount = 0;
            switch (bankNotes) {
                case "5":
                    bankNoteAmount = 5;
                    break;
                case "10":
                    bankNoteAmount = 10;
                    break;
                case "20":
                    bankNoteAmount = 20;
                    break;
            }
            if (bankNoteAmount == 0) {
                System.out.println("Please insert money again");
            } else {
                machine.acceptBankNote(new Banknote(bankNoteAmount, "BYN"));
            }
        } while (true);
    }
}