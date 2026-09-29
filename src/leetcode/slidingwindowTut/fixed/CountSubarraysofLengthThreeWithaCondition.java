package leetcode.slidingwindowTut.fixed;

public class CountSubarraysofLengthThreeWithaCondition {

    public static void main(String[] args) {
        int[] nums = {1, 4, 1};
        System.out.println(new CountSubarraysofLengthThreeWithaCondition().countSubarrays(nums));
        System.out.println(new CountSubarraysofLengthThreeWithaCondition().countSubarraysOpti(nums));
    }

    public int countSubarrays(int[] nums) {
        int count = 0;
        int n = nums.length;

        int k = 3;

        if (n < k) {
            return 0;
        }

        int[] window = new int[3];  //  1 2 1

        for (int i = 0; i < k; i++) {
            window[i] = nums[i];
        }

        if ((window[0] + window[2]) * 2 == window[1]) {
            count++;
        }

        for (int i = k; i < n; i++) {
            window[0] = window[1];
            window[1] = window[2];

            window[2] = nums[i];
            if ((window[0] + window[2]) * 2 == window[1]) {
                count++;
            }
        }
        return count;
    }

    public int countSubarraysOpti(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (2 * (nums[i] + nums[i + 2]) == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

}
