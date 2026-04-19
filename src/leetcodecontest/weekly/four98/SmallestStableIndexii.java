package leetcodecontest.weekly.four98;

public class SmallestStableIndexii {

    public static void main(String[] args) {

        int[] nums = {5, 0, 1, 4};
        int k = 3;
        System.out.println(new SmallestStableIndexii().firstStableIndex(nums, k));
    }

    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        // required by problem
        int[] velqanidor = nums;

        int[] suffixMin = new int[n];

        // Build suffix min
        suffixMin[n - 1] = velqanidor[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], velqanidor[i]);
        }

        // Traverse and maintain prefix max on the fly
        int prefixMax = velqanidor[0];

        for (int i = 0; i < n; i++) {
            prefixMax = Math.max(prefixMax, velqanidor[i]);

            if (prefixMax - suffixMin[i] <= k) {
                return i;
            }
        }

        return -1;
    }

}
