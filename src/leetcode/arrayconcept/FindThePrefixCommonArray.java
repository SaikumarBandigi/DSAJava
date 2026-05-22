package leetcode.arrayconcept;

import java.util.Arrays;

public class FindThePrefixCommonArray {

    public static void main(String[] args) {

        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};

        System.out.println(Arrays.toString(new FindThePrefixCommonArray().findThePrefixCommonArray(A, B)));

    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;

        int[] ans = new int[n];

        boolean[] seenA = new boolean[n + 1];
        boolean[] seenB = new boolean[n + 1];

        int common = 0;

        for (int i = 0; i < n; i++) {

            // If A[i] already appeared in B
            if (seenB[A[i]]) {
                common++;
            }

            // Mark A[i] as seen
            seenA[A[i]] = true;

            // If B[i] already appeared in A
            // Avoid double count when A[i] == B[i]
            if (A[i] != B[i] && seenA[B[i]]) {
                common++;
            }

            // Mark B[i] as seen
            seenB[B[i]] = true;

            ans[i] = common;
        }

        return ans;
    }

}
