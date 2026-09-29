package leetcode.slidingwindowTut.fixed;

import java.util.Arrays;

public class DefusetheBomb {

    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 4};
        int k = 3;
        int[] res = new DefusetheBomb().decrypt(arr, k);
        System.out.println(Arrays.toString(res));
    }

    public int[] decrypt(int[] code, int k) {
        int n = code.length;

        int[] arr = new int[n];
        if (k == 0) return arr;

        if (k > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= k; j++) {
                    arr[i] += code[(i + j) % n];
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= -k; j++) {
                    arr[i] += code[(i - j + n) % n];
                }
            }
        }
        return arr;
    }
}
