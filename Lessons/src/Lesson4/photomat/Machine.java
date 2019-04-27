package Lesson4.photomat;

public class Machine {

    Banknote[] bankNotes = new Banknote[0];

    public void countBankNotes() {
        int sum = 0;
        for (int i = 0; i < bankNotes.length; i++) {
            sum += bankNotes[i].amount;
        }
        System.out.println("Count: " + bankNotes.length + " total: " + sum);
    }

    public void acceptBankNote(Banknote banknote) {
        Banknote[] newBankNotes = new Banknote[bankNotes.length + 1];
        for(int i = 0; i < bankNotes.length; i++) {
            newBankNotes[i] = bankNotes[i];
        }
        newBankNotes[newBankNotes.length - 1] = banknote;
        bankNotes = newBankNotes;
    }

    public void makePhoto() {
        char[][] photo = new char[9][12];
        int y = 33;
        for (int i = 0; i < photo.length; i++) {
            System.out.print("|");
            for (int j = 0; j < photo[i].length; j++) {
                //photo[i][j] = ;
                System.out.print(Character.toChars(y++));
                //System.out.print("(" +i + "," + j + ")");
            }
            System.out.println("|");
        }
    }
}