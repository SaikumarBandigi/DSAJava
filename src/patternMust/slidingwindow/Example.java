package patternMust.slidingwindow;

public class Example {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println(new Example().getMax(arr, k));

    }

    int getMax(int[] arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int i = k; i < arr.length; i++) {

            int left = arr[i - k];
            int right = arr[i];

            sum = sum - left + right;
            max = Math.max(max, sum);
        }
        return max;
    }

}
