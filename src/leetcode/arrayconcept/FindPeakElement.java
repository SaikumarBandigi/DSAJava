package leetcode.arrayconcept;

public class FindPeakElement {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        System.out.println(new FindPeakElement().findPeakElement(nums));

    }

    public int findPeakElement(int[] nums) {
        int n = nums.length;

        // If only one element
        if (n == 1) return 0;

        for (int i = 0; i < n; i++) {

            // First element
            if (i == 0) {
                if (nums[i] >= nums[i + 1]) {
                    return i;
                }
            }

            // Last element
            else if (i == n - 1) {
                if (nums[i] >= nums[i - 1]) {
                    return i;
                }
            }

            // Middle elements
            else {
                if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) {
                    return i;
                }
            }
        }

        return -1;
    }

}
