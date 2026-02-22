package leetcodecontest.weekly.four70;

public class ComputeAlternatingSum {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        System.out.println(alternatingSum(nums));
    }

    public static int alternatingSum(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(i)) {
                sum += nums[i];
            } else {
                sum -= nums[i];
            }
        }

        return sum;
    }

    static boolean isEven(int num) {
        return (num & 1) == 0;
    }

}
