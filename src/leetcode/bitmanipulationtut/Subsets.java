package leetcode.bitmanipulationtut;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {

        int[] nums = {0};
        System.out.println(new Subsets().subsets(nums));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {

        // Add current subset to result
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            // choose
            current.add(nums[i]);

            // explore
            backtrack(nums, i + 1, current, result);

            // unchoose (backtrack)
            current.remove(current.size() - 1);
        }
    }


}
