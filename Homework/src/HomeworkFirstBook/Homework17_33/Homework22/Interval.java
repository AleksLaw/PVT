package HomeworkFirstBook.Homework17_33.Homework22;

public class Interval {
    private int sec;
    private int min;
    private int hour;

    public void getTotalSec() { //получение количества сек в интервалах
        System.out.println("Количество секунд в интервале = " + (this.sec + this.min * 60 + this.hour * 3600));
    }

    public void compare(Interval s) { //сравнение по секундам в интервалах
        if (s.sec + s.min * 60 + s.hour * 3600 > this.sec + this.min * 60 + this.hour * 3600) {
            System.out.println("Второй интервал больше первого");
        } else if ((this.sec + this.min * 60 + this.hour * 3600) > (s.sec + s.min * 60 + s.hour * 3600)) {
            System.out.println("Первый интервал больше второго");
        } else System.out.println("Интервалы равны");
    }

    public void info() { //Вывод данных об объекте вне зависимости какой конструктор использовался
        if (this.sec > 0 && this.min == 0 && this.hour == 0) {
            int s = this.sec;
            int sec;
            int min;
            int hour;

            hour = s / 3600 % 24;
            s %= 3600;
            min = s / 60;
            sec = s % 60;
            System.out.println(hour + " ч " + min + " м " + sec + " с");
        } else System.out.println(hour + " ч " + min + " м " + sec + " с");
    }

    public Interval(int sec) {
        this.sec = sec;
    }

    public Interval(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
