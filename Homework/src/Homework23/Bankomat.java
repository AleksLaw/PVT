package Homework23;

public class Bankomat {
    private int $20 = 100;
    private int $50 = 100;
    private int $100 = 100;


    public int get$20() {
        return $20;
    }

    public void set$20(int $20) {
        this.$20 = $20;
    }

    public int get$50() {
        return $50;
    }

    public void set$50(int $50) {
        this.$50 = $50;
    }

    public int get$100() {
        return $100;
    }

    public void set$100(int $100) {
        this.$100 = $100;
    }

    public int add$20(int s) { //Добавить 20
        if (s < 0) {
            System.out.println("Функция только для добавления купюр $20");
        }
        System.out.println("Добавлено " + s + " купюр $20");
        return $20 = $20 + s;
    }

    public int add$50(int s) { //Добавить 50
        if (s < 0) {
            System.out.println("Функция только для добавления купюр $50");
        }
        System.out.println("Добавлено " + s + " купюр $50");
        return $50 = $50 + s;
    }

    public int add$100(int s) { //Добавить 100
        if (s < 0) {
            System.out.println("Функция только для добавления купюр $100");
        }
        System.out.println("Добавлено " + s + " купюр $100");
        return $100 = $100 + s;
    }


    public int getTotalSumm() { // сумма денег в банкомате
        System.out.println("Количество денег в банкомате = " + ("$20-" + this.$20 + " шт. " + " $50-" + this.$50 + " шт. " + " $100-" + this.$100 + " шт. " + " Итого: " + (this.$20 * 20 + this.$50 * 50 + this.$100 * 100) + " денег"));
        return (this.$20 * 20 + this.$50 * 50 + this.$100 * 100);
    }


    public boolean getMoneyYesNo(int sum) { //Вывод можно или нельзя
        boolean yesNo;
        {
            if (sum <= (this.$20 * 20 + this.$50 * 50 + this.$100 *100) && ((sum % 100 == 20 && get$20() >= 1) || (sum % 100 == 40 && get$20() >= 2) || (sum % 100 == 60 && get$20() >= 3) || (sum % 100 == 70 && get$20() >= 1 && get$50() >= 1) || ((sum % 100 == 80 ||sum==80) && get$20() >= 4) || (sum % 100 == 90 && get$20() >= 2 && get$50() >= 1)||(sum%20==0&&sum<=get$20()*20))) {
                return true;
            } else if (sum <= (this.$20 * 20 + this.$50 * 50 + this.$100 * 100) && sum % 100 == 50 && get$50() >= 1) {
                return true;
            } else if (sum <= (this.$20 * 20 + this.$50 * 50 + this.$100 * 100) && sum % 100 == 0 && get$100() != 0) {
                return true;
            } else System.out.println("Данную сумму нельзя снять");
            return false;
        }
    }

    public void getMoney(int summa) { //получение денег

        if (getMoneyYesNo(summa) == true) {
            System.out.println("Аукцион невиданной щедрости. Выдаем деньги!!!");
            int count20 = 0;
            int count50 = 0;
            int count100 = 0;

            while (summa >= 100 && get$100() != 0) {
                summa = summa - 100;
                count100 = count100 + 1;
                $100 = $100 - 1;
            }

            while (((summa >= 100 && get$50()>= 2))) {
                summa = summa - 50;
                count50 = count50 + 1;
                $50 = $50 - 1;
            }

            if ((summa == 50||summa == 90||summa %100== 90||summa %100== 30||summa %100==  50||summa == 70  && get$50() >= 1)){
                summa = summa - 50;
                count50 = count50 + 1;
                $50 = $50 - 1;
            }

            while (summa != 0) {
                summa = summa - 20;
                count20 = count20 + 1;
                $20 = $20 - 1;
            }
            System.out.println("$100-" + count100 + " шт. " + "$50-" + count50 + " шт. " + "$20-" + count20 + " шт. " + "Итого выдано: " + (count100 * 100 + count50 * 50 + count20 * 20) + " денег");
        }
    }

    public Bankomat(int $20, int $50, int $100) {
        this.$20 = $20;
        this.$50 = $50;
        this.$100 = $100;
    }
}
