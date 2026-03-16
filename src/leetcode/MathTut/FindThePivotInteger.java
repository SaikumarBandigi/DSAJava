package leetcode.MathTut;

public class FindThePivotInteger {
    public static void main(String[] args) {

        int n = 8;
        System.out.println(new FindThePivotInteger().pivotInteger(n));
    }

    public int pivotInteger(int n) {

        int[] arr = new int[n]; // 1 2 3 4 5 6 7 8
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            arr[idx++] = i;
        }

        // total sum
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum + arr[i];
            if (leftSum == rightSum) {
                return arr[i];
            }
        }

        return -1;
    }

}
