package leetcode.arrayconcept;

public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {

        int[] arr = {1, 5, 4, 5};
        System.out.println(new MaximumProductofTwoElementsinanArray().maxProduct(arr));

    }

    public int maxProduct(int[] nums) {

        int maxProduct = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                int presentMax = (nums[i] - 1) * (nums[j] - 1);
                if (presentMax > maxProduct) {
                    maxProduct = presentMax;
                }
            }
        }
        return maxProduct;
    }

}
