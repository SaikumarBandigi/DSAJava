package leetcodecontest.weekly.four98;

public class SmallestStableIndexi {

    public static void main(String[] args) {
        int[] nums = {5, 0, 1, 4};
        int k = 3;
        System.out.println(new SmallestStableIndexi().firstStableIndex(nums, k));
    }

    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];

        // Build prefix max
        prefixMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }

        // Build suffix min
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }

        // Find smallest stable index
        for (int i = 0; i < n; i++) {
            if (prefixMax[i] - suffixMin[i] <= k) {
                return i;
            }
        }

        return -1;
    }

}
