package leetcodecontest.weekly.Four93;

import java.text.NumberFormat;

public class CountCommasInRange {
    public static void main(String[] args) {

        int n = 100000; // 10 pow 5
        System.out.println(new CountCommasInRange().countCommas(n));
    }

    int countCommas(int num) {
        if (num < 1000) {
            return 0;
        }
        return num - 999;
    }


}
