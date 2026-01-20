package patternMust.slidingwindow.fixedwindow.max_min_avg;

import java.util.Arrays;

public class DefuseBomb {
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 3};
        int k = -2;

        System.out.println(Arrays.toString(new DefuseBomb().decryptSlidingWindow(arr, k)));
        System.out.println(Arrays.toString(new DefuseBomb().decryptBruteForce(arr, k)));
    }

    public int[] decryptSlidingWindow(int[] code, int k) {

        int n = code.length;
        int[] result = new int[n];

        // Case 1: k == 0
        if (k == 0) {
            return result;   // already filled with 0
        }

        // Duplicate array to handle circular behavior
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = code[i % n];
        }

        // Case 2: k > 0 (next k elements)
        if (k > 0) {
            int windowSum = 0;
            int left = 1, right = k;

            // initial window
            for (int i = left; i <= right; i++) {
                windowSum += arr[i];
            }

            for (int i = 0; i < n; i++) {
                result[i] = windowSum;

                // slide window
                windowSum -= arr[left];
                left++;
                right++;
                windowSum += arr[right];
            }
        }

        // Case 3: k < 0 (previous |k| elements)
        else {
            k = -k;
            int windowSum = 0;
            int left = n - k, right = n - 1;

            // initial window
            for (int i = left; i <= right; i++) {
                windowSum += arr[i];
            }

            for (int i = 0; i < n; i++) {
                result[i] = windowSum;

                // slide window
                windowSum -= arr[left];
                left++;
                right++;
                windowSum += arr[right];
            }
        }

        return result;
    }

    public int[] decryptBruteForce(int[] code, int k) {

        int n = code.length;
        int[] result = new int[n];

        if (k == 0)
            return result;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];   // next elements
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];  // previous elements
                }
            }

            result[i] = sum;
        }

        return result;
    }

}
