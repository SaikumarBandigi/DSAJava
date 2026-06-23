package leetcode.bitmanipulationtut;

public class TotalHamingDistance {

    public static void main(String[] args) {

        int[] nums = {4, 14, 4};
        System.out.println(new TotalHamingDistance().totalHammingDistance(nums));

    }

    public int totalHammingDistance(int[] nums) {

        // 4 ->  0100
        // 14 >  1110

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }

        return sum;
    }

}
