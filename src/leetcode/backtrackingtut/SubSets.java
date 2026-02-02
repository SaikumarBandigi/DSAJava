package leetcode.backtrackingtut;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(new SubSets().subsets(nums));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> tempList, List<List<Integer>> result) {
        // Add current subset
        result.add(new ArrayList<>(tempList));

        // Explore further elements
        for (int i = index; i < nums.length; i++) {
            // 1. Choose
            tempList.add(nums[i]);

            // 2. Explore
            backtrack(nums, i + 1, tempList, result);

            // 3. Undo
            tempList.remove(tempList.size() - 1);
        }
    }

}
