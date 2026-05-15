package practisetut;


public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {6, 7, 8, 1, 2, 3, 4}; // 1 2 3 4 5 6 7 8
        System.out.println(new FindMinimumInRotatedSortedArray().findMIn(arr));
    }

    int findMIn(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is greater than right, minimum is in right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // Else minimum is in left half (including mid)
            else {
                right = mid;
            }
        }
        return nums[left];
    }

}
