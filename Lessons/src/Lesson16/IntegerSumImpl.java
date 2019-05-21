package Lesson16;

public class IntegerSumImpl {

    public int calculateSum(int x) {
        int res = 0;
        for (int i = 0; i <= x; i++) {
            res += i;
        }
        return res;
    }
}