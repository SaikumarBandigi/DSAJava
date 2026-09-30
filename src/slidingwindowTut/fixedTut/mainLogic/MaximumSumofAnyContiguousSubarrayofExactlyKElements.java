package slidingwindowTut.fixedTut.mainLogic;

public class MaximumSumofAnyContiguousSubarrayofExactlyKElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println(new MaximumSumofAnyContiguousSubarrayofExactlyKElements().bruteForce(arr, k));
    }

    int bruteForce(int[] arr, int k) {

        int maximum = 0;
        int n = arr.length;

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
                if (sum > maximum) {
                    maximum = sum;
                }
            }
        }
        return maximum;
    }

//    int slidingWindowTech(int[] arr, int k) {
//
//    }
}
