package leetcode.stringconcept;

import java.util.ArrayList;
import java.util.List;

public class SubsetBacktracking {
    public static void main(String[] args) {
        int[] nums = {1, 2};

        List<Integer> current = new ArrayList<>();
        backtrack(nums, 0, current);
    }

    static void backtrack(int[] nums, int index, List<Integer> current) {

        // Every stage is a valid subset
        System.out.println(current);

        for (int i = index; i < nums.length; i++) {

            // ----- CHOOSE -----
            current.add(nums[i]);

            // ----- EXPLORE -----
            backtrack(nums, i + 1, current);

            // ----- UNCHOOSE -----
            current.remove(current.size() - 1);
        }
    }

}