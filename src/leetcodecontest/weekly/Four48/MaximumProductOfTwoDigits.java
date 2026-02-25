package leetcodecontest.weekly.Four48;

public class MaximumProductOfTwoDigits {
    public static void main(String[] args) {
        int n = 124;
        System.out.println(maxProduct(n));  // 8
    }

    public static int maxProduct(int n) {

        String compiled = get(n);  // 421
        int[] nums = new int[compiled.length()];  // 124

        // Proper digit conversion
        for (int i = compiled.length() - 1; i >= 0; i--) {
            nums[i] = compiled.charAt(i) - '0';
        }

        int maxProduct = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i == j) continue;
                int currentProduct = nums[i] * nums[j];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }

        return maxProduct;
    }

    static String get(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int digit = n % 10;
            sb.append(digit);
            n /= 10;
        }
        return sb.toString();
    }

}