package Homework25;

public class DebitCreditCard extends BankCard {

    protected boolean credit = false;

    public boolean credit() {
        if (credit == true) {
            System.out.println("Кредитная карта! " + this.type);
        } else System.out.println("Дебетовая карта! " + this.type);
        return credit = true;
    }

    public DebitCreditCard(String type) {
        super(type);
    }
    @Override
    public String toString() {
        return "Карта типа " +type +  " credit=" + credit ;
    }

}
