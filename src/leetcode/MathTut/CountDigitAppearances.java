package leetcode.MathTut;

public class CountDigitAppearances {

    public static void main(String[] args) {
        int[] nums = {12, 54, 32, 22};
        int digit = 2;
        System.out.println(new CountDigitAppearances().countDigitOccurrences(nums, digit));
    }

    public int countDigitOccurrences(int[] nums, int digit) {

        int count = 0;

        for (int num : nums) {
            count += getCount(num, digit);
        }
        return count;
    }

    int getCount(int num, int targetDigit) {
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit == targetDigit) {
                count++;
            }
            num /= 10;
        }
        return count;
    }


}
