package leetcode.slidingwindowTut;

public class ALaptopFixedW {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int w = 3;
        int k = 7;
        System.out.println(get(nums, w, k));
    }

    private static int get(int[] nums, int w, int k) {
        int sum = 0, count = 0;

        for (int i = 0; i < w; i++) {
            sum += nums[i];
        }

        if (sum >= k) {
            count++;
        }

        for (int i = w; i < nums.length; i++) {
            sum += nums[i] - nums[i - w];
            if (sum >= k) {
                count++;
            }
        }
        return count;
    }
}
