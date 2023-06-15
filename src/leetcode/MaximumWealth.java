package leetcode;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {3, 4, 5}
        };
        System.out.println(maximumWealth(a));
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        // int ans=0;x
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
                // sum=sum+anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}


