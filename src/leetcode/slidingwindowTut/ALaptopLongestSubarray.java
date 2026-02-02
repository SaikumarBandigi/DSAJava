package leetcode.slidingwindowTut;

public class ALaptopLongestSubarray {
    public static int longestSubarray(int[] arr, int k) {
        int left = 0, sum = 0, maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 1};
        System.out.println(longestSubarray(arr, 6));
    }
}
