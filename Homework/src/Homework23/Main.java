package Homework23;
//Задание
//Создать класс банкомат три вида купюр 20 50 100
//методы 1. Добавить купюры 2.Проверка снятия денег 3.Если можно то какими купюрами получишь
// конструктор с 3 параметрами
public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(100,100,100);
        bankomat.getTotalSumm();

        bankomat.add$20(0);
        bankomat.add$50(0);
        bankomat.add$100(0);
        bankomat.getTotalSumm();
        bankomat.get$100();


        bankomat.getMoneyYesNo(190);
        bankomat.getMoney(20);
        bankomat.getMoney(40);
        bankomat.getMoney(60);
        bankomat.getMoney(70);
        bankomat.getMoney(80);
        bankomat.getMoney(90);
        bankomat.getMoney(100);
        bankomat.getMoney(120);
        bankomat.getMoney(140);
        bankomat.getMoney(50);
        bankomat.getMoney(150);
        bankomat.getMoney(160);
        bankomat.getMoney(170);
        bankomat.getMoney(180);
        bankomat.getMoney(190);
        bankomat.getMoney(200);
        bankomat.getMoney(220);
        bankomat.getMoney(240);
        bankomat.getMoney(250);
        bankomat.getMoney(260);
        bankomat.getMoney(270);
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
