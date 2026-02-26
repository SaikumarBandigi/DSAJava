package patternMust.slidingwindow.fixedwindow.max_min_avg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstNegativeNumberinEveryWindowofSizeK {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        // -1 -1 -7 -15 -15 0
        int a = 3;
        System.out.println(Arrays.toString(firstNegative(arr, a)));

    }
    static int[] firstNegative(int[] arr, int k) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            boolean found = false;
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    list.add(arr[j]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                list.add(0);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
