package leetcode.dynamicprogrammingTut;

public class HouseRobber {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        System.out.println(new HouseRobber().rob(nums));

    }

    public int rob(int[] nums) {
        int prev1 = 0; // dp[i-1]
        int prev2 = 0; // dp[i-2]

        for (int num : nums) {

            int take = num + prev2;
            int skip = prev1;

            int curr = Math.max(take, skip);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

}
