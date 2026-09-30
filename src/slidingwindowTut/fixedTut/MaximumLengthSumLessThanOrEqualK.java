package slidingwindowTut.fixedTut;

public class MaximumLengthSumLessThanOrEqualK {
    public static void main(String[] args) {

        // 1 1 7 is maxLength is 3
        int[] arr = {1, 1, 7, 8};
        int k = 15;
        System.out.println(new MaximumLengthSumLessThanOrEqualK().maxLengthSumLessThanOrEqualK(arr, k));
    }

    int maxLengthSumLessThanOrEqualK(int[] arr, int k) {

        int n = arr.length;
        int left = 0;
        int sum = 0;

        int maximumLength = Integer.MIN_VALUE;

        for (int right = 0; right < n; right++) {
            sum = sum + arr[right];

            while (sum > k) {
                sum = sum - arr[left];
                left++;
            }
            int windowLength = right - left + 1;
            if (windowLength > maximumLength) {
                maximumLength = windowLength;
            }
        }
        return maximumLength;
    }

}