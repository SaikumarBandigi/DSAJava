package leetcode.HashMapTut;

public class SumofElementsWithFrequencyDivisiblebyK {

    public static void main(String[] args) {

        int[] nums = {4, 4, 4, 1};
        int k = 3;

        System.out.println(new SumofElementsWithFrequencyDivisiblebyK().sumDivisibleByKOptimal(nums, k));

    }

    public int sumDivisibleByKOptimal(int[] nums, int k) {

        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        int sum = 0;

        for (int num : nums) {
            if (freq[num] % k == 0) {
                sum += num;
            }
        }

        return sum;
    }

}
