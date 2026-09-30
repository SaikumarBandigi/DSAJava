package slidingwindowTut.fixedTut;

public class MinimumLengthSumLessThanOrEqualK {
    public static void main(String[] args) {

        // 1 or 1 or 7 or 8  min length is 1
        int[] arr = {1, 1, 7, 8};
        int k = 15;
        System.out.println(new MinimumLengthSumLessThanOrEqualK().minimumLengthSumLessThanOrEqualK(arr, k));
    }

    int minimumLengthSumLessThanOrEqualK(int[] arr, int k) {

        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int n = arr.length;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            // Add current element
            sum = sum + arr[right];

            // Window is valid when sum <= k
            while (left <= right && sum <= k) {
                int windowLength = right - left + 1;
                if (windowLength < minLength) {
                    minLength = windowLength;
                }
                sum = sum - arr[left];
                left++;
            }
        }

        // If no valid subarray exists
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }

}


