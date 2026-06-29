package leetcode.slidingwindowTut.variable;

public class MaxConsecutiveOnesIII {

    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1};
        int k = 1;
        System.out.println(new MaxConsecutiveOnesIII().longestOnes(nums, k));
    }

    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;
// expan window
        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeroCount++;
            }
// shrink if window invalid
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
// window now valid
            // update the answer
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
/*
maxLength is not counting only the original 1s.
It is counting the size of the current valid window, because every 0 in that window can be flipped to 1.
 */
}
