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
        bankomat.getMoney(150);
        bankomat.getMoney(160);
        bankomat.getMoney(170);
        bankomat.getMoney(180);
        bankomat.getMoney(190);
        bankomat.getMoney(200);
        bankomat.getMoney(210);
        bankomat.getMoney(220);
        bankomat.getMoney(230);
        bankomat.getMoney(240);
        bankomat.getMoney(250);
        bankomat.getMoney(260);
        bankomat.getMoney(270);
        bankomat.getTotalSumm();


    }

}
