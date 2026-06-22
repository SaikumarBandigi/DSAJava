package patternMust.slidingwindow.fixedwindow.max_min_avg;

import java.util.Arrays;

public class FindAverageofEverySubarrayofSizeK {

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        System.out.println(Arrays.toString(new FindAverageofEverySubarrayofSizeK().getAvgOfEverySubArray(arr, k)));
    }

    double[] getAvgOfEverySubArray(int[] arr, int k) {

        double[] res = new double[arr.length - k + 1];

        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        double firstAvg = sum / k;
        res[0] = firstAvg;

        int index = 1;

        for (int i = k; i < arr.length; i++) {
            int left = arr[i - k];
            int right = arr[i];

            sum = sum - left + right;

            double thenAvg = sum / k;
            res[index++] = thenAvg;
        }
        return res;
    }

}
