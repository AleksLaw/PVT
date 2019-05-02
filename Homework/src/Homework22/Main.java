package Homework22;

public class Main {
    public static void main(String[] args) {

        Interval interval1 = new Interval(2, 25, 1);
        Interval interval2 = new Interval(5103);

        interval1.compare(interval2);
        interval1.info();
        interval2.info();
        interval1.getTotalSec();
        interval2.getTotalSec();

    }
}
