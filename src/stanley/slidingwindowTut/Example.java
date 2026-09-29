package stanley.slidingwindowTut;

public class Example {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int k = 2;
        System.out.println(new Example().maxSubArraySum(arr, k));
    }

    int maxSubArraySum(int[] arr, int k) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        int max = sum;
        for (int i = k; i < n; i++) {
            sum = sum + arr[i];  // we need to add incoming element
            sum = sum - arr[i - k];   // we need to remove outgoing element
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    // instead of recalculating windows again & again please use previous windows work

}
