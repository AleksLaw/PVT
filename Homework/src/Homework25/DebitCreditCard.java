package Homework25;

public class DebitCreditCard extends BankCard {

    private boolean credit = false;
    private boolean debit = false;

    public boolean credit() {
        if (this.credit==true){
            this.debit=false;
        }

        System.out.println("Кредитная карта! " + this.type);
        return true;
    }

    public boolean debit() {
        if (this.debit==true){
            this.credit=false;
        }
        System.out.println("Дебетовая карта! " + this.type);
        return true;
    }


    public DebitCreditCard(String name) {
        super(name);
    }


}
