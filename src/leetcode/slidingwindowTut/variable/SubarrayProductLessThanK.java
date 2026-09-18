package leetcode.slidingwindowTut.variable;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {10, 5};
        int k = 100;
        System.out.println(new SubarrayProductLessThanK().numSubarrayProductLessThanK(nums, k));
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int count = 0; //3
        int left = 0;
        int product = 1;
        for (int right = 0; right < nums.length; right++) {
            product = product * nums[right];

            while (product >= k) {
                product = product / nums[left];
                left++;
            }
            int cWindowLength = right - left + 1;
            count = count + cWindowLength;
        }
        return count;
    }

}
