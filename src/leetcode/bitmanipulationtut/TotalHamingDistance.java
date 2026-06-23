package leetcode.bitmanipulationtut;

public class TotalHamingDistance {

    public static void main(String[] args) {

        int[] nums = {4, 14, 4};
        System.out.println(new TotalHamingDistance().totalHammingDistance(nums));
        System.out.println(new TotalHamingDistance().totalHammingDistancOptimal(nums));

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

    public int totalHammingDistancOptimal(int[] nums) {

        int totalDistance = 0;
        int n = nums.length;

        for (int bit = 0; bit < 32; bit++) {
            int ones = 0;
            for (int num : nums) {
                if (isNthBitSet(num, bit)) {
                    ones++;
                }
            }
            int zeros = n - ones;
            totalDistance += ones * zeros;
        }

        return totalDistance;
    }

    boolean isNthBitSet(int num, int bit) {
        return ((num >> bit) & 1) == 1;
    }

}

/*

0100
^
1110
_________
1010 -> 10 then Integer.bitCount(10) counts number of 1 bits in Binary Representation

 */
