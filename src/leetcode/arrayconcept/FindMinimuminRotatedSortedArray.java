package leetcode.arrayconcept;

public class FindMinimuminRotatedSortedArray {

    public static void main(String[] args) {


        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(new FindMinimuminRotatedSortedArray().findMin(nums));


    }

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum is in right half
                left = mid + 1;
            } else {
                // Minimum is in left half (including mid)
                right = mid;
            }
        }

        return nums[left];
    }


}
