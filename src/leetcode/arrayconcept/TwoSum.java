package leetcode.arrayconcept;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(new TwoSum().getTwoSumArray(nums, target)));
    }

    int[] getTwoSumArray(int[] nums, int target) {

        return IntStream.range(0, nums.length)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, nums.length)
                        .filter(j -> nums[i] + nums[j] == target)
                        .mapToObj(j -> new int[]{i, j})
                )
                .findFirst()
                .orElse(new int[]{-1, -1});
    }

}
