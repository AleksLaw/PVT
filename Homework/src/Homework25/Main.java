package Homework25;

public class Main {
    public static void main(String[] args) {
        RFidTehnologue visa =new RFidTehnologue("VISA");
        visa.credit();
        visa.onRFid();
        System.out.println(visa);
        DebitCreditCard masterCard = new DebitCreditCard("MasterCard");
        masterCard.credit();
        System.out.println(masterCard);



    }
}
