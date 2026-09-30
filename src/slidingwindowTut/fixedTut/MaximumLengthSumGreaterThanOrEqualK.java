package slidingwindowTut.fixedTut;

public class MaximumLengthSumGreaterThanOrEqualK {
    public static void main(String[] args) {
        // 1 1 7 8 is maxLength is 4
        int[] arr = {1, 1, 7, 8};
        int k = 15;
        System.out.println(new MaximumLengthSumGreaterThanOrEqualK().SumGreaterThanOrEqualK(arr, k));
    }

    int SumGreaterThanOrEqualK(int[] arr, int k) {

        int n = arr.length;
        int left = 0;
        int sum = 0;

        int maximumLength = Integer.MIN_VALUE;

        for (int right = 0; right < n; right++) {
            sum = sum + arr[right];

            while (sum >= k) {
                int windowLength = right - left + 1;
                if (windowLength > maximumLength) {
                    maximumLength = windowLength;
                }
                sum = sum - arr[left];
                left++;
            }
        }
        return maximumLength;
    }

}
