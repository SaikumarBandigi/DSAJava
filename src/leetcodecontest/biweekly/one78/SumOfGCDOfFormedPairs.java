package leetcodecontest.biweekly.one78;

import java.util.Arrays;

public class SumOfGCDOfFormedPairs {
    public static void main(String[] args) {

        int[] nums = {3, 6, 2, 8};
        System.out.println(new SumOfGCDOfFormedPairs().gcdSum(nums));

    }

    public long gcdSum(int[] nums) {

        int n = nums.length;

        // Step 1: prefix maximum
        int[] Max = new int[n];
        Max[0] = nums[0];

        for (int i = 1; i < n; i++) {
            Max[i] = Math.max(Max[i - 1], nums[i]);
        }

        int[] prefixMax = new int[n];

        for (int i = 0; i < prefixMax.length; i++) {
            prefixMax[i] = GCD(nums[i], Max[i]);
        }

        // Step 2: sort
        Arrays.sort(prefixMax);

        // Step 3: pair and sum gcd
        long sum = 0;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            sum += GCD(prefixMax[left], prefixMax[right]);
            left++;
            right--;
        }

        return sum;
    }


    int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    boolean isEven(int num) {
        return (num & 1) == 0;
    }

}
