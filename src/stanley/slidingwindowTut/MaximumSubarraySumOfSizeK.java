package stanley.slidingwindowTut;

public class MaximumSubarraySumOfSizeK {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int k = 2;
        System.out.println(new MaximumSubarraySumOfSizeK().maxSubArraySum(arr, k));
    }

    int maxSubArraySum(int[] arr, int k) {

        int sum = -1;  //3
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        int max = sum;  // 3

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i];
            sum = sum - arr[i - k];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

}
