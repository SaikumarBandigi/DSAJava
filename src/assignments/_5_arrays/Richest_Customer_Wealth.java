package assignments._5_arrays;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {

        int[][] nums = {
                {1, 2, 3},
                {3, 2, 2}
        };

        int res = maximumWealth(nums);
        System.out.println(res);

    }

    public static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
