package Homework23;
//Задание
//Создать класс банкомат три вида купюр 20 50 100
//методы 1. Добавить купюры 2.Проверка снятия денег 3.Если можно то какими купюрами получишь
// конструктор с 3 параметрами
public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(100,2,0);
        bankomat.getTotalSumm();

        bankomat.add$20(0);
        bankomat.add$50(0);
        bankomat.add$100(0);
        bankomat.getTotalSumm();
        bankomat.get$100();


        bankomat.getMoneyYesNo(190);
        bankomat.getTotalSumm();
        bankomat.getMoney(280);
        bankomat.getMoney(290);
        bankomat.getMoney(300);
        bankomat.getMoney(320);
        bankomat.getMoney(340);
        bankomat.getMoney(350);
        bankomat.getMoney(360);
        bankomat.getMoney(380);
        bankomat.getMoney(370);
        bankomat.getMoney(390);
        bankomat.getMoney(400);
        bankomat.getMoney(420);
        bankomat.getMoney(440);
        bankomat.getTotalSumm();


    }

}
