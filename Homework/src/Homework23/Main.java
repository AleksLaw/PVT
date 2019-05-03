package Homework23;

public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(1,3,0);
        bankomat.getTotalSumm();

        bankomat.add$20(0);
        bankomat.add$50(0);
        bankomat.add$100(0);
        bankomat.getTotalSumm();
        bankomat.get$100();


        bankomat.getMoneyYesNo(170);
        bankomat.getMoney(170);
        bankomat.getTotalSumm();


    }

}
