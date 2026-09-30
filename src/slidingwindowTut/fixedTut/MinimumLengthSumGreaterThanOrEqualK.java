package slidingwindowTut.fixedTut;

public class MinimumLengthSumGreaterThanOrEqualK {

    public static void main(String[] args) {

        int[] arr = {1, 1, 7, 8};
        int k = 15;
        System.out.println(new MinimumLengthSumGreaterThanOrEqualK().minimumLengthSumGreaterThanOrEqualK(arr, k));
    }

    int minimumLengthSumGreaterThanOrEqualK(int[] arr, int k) {

        int n = arr.length;
        int minimumLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum = sum + arr[right];

            while (sum >= k) {
                int windowLength = right - left + 1;
                if (windowLength < minimumLength) {
                    minimumLength = windowLength;
                }
                sum = sum - arr[left];
                left++;
            }
        }
        if (minimumLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minimumLength;
    }

}
