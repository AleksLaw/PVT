package Homework25;
//Задание
// Создать иерархию классов для банковских карт

public class Main {
    public static void main(String[] args) {
        RFidTehnologue visa = new RFidTehnologue("VISA");
        visa.credit(true);
        visa.onRFid(true);
        System.out.println(visa);
        RFidTehnologue visa1 = new RFidTehnologue("VISA");
        visa.credit(true);
        visa.onRFid(false);
        System.out.println(visa);
        DebitCreditCard masterCard = new DebitCreditCard("MasterCard");
        masterCard.credit(false);
        System.out.println(masterCard);


    }
}
