package leetcode.slidingwindowTut;

public class ALaptopMinSubarraySum {
    public static int minSubArrayLen(int[] arr, int k) {
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum >= k) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        System.out.println(minSubArrayLen(arr, 7));
    }
}
