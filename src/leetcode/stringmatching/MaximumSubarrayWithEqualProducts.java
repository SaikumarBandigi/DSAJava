package leetcode.stringmatching;

public class MaximumSubarrayWithEqualProducts {
    public static void main(String[] args) {

        int[] nums = {3, 4, 5};
       System.out.println(maxLength(nums));

    }

    public static int maxLength(int[] nums) {

        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            long product = 1;
            int firstGCDaValue = 0;
            long l = 1;

            for (int j = i; j < n; j++) {
                product *= nums[j];

                firstGCDaValue = GCD(firstGCDaValue, nums[j]);
                l = LCM(l, nums[j]);

                if (product == (long) firstGCDaValue * l) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }

                // prevent overflow
                if (product > 1e12)
                    break;
            }
        }

        return maxLen;
    }

    static long LCM(long a, long b) {
        return (a * b) / GCD((int) a, (int) b);
    }

    private static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}
