package Homework23;

public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(100,100,0);
        bankomat.getTotalSumm();

//        bankomat.add$20(0);
//        bankomat.add$50(0);
//        bankomat.add$100(0);
  //      bankomat.getTotalSumm();
        bankomat.get$100();


        //bankomat.getMoneyYesNo(140);
        bankomat.getMoney(1180);
        bankomat.getTotalSumm();


    }

}
