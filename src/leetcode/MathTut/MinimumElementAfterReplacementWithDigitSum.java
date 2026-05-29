package leetcode.MathTut;

public class MinimumElementAfterReplacementWithDigitSum {

    public static void main(String[] args) {

        int[] nums = {10, 12, 13, 14};
        System.out.println(new MinimumElementAfterReplacementWithDigitSum().minElement(nums));

    }

    public int minElement(int[] nums) {

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = getSumOfDigits(nums[i]);
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    int getSumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

}
