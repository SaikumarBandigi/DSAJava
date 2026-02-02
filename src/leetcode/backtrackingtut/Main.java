package leetcode.backtrackingtut;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2};   // you can put ANY size n

        subsets(nums, 0, new ArrayList<>());
    }

    static void subsets(int[] nums, int index, List<Integer> list) {

        // print current subset
        System.out.println(list);

        for (int i = index; i < nums.length; i++) {

            // 1. choose
            list.add(nums[i]);

            // 2. explore
            subsets(nums, i + 1, list);

            // 3. undo
            list.remove(list.size() - 1);
        }
    }

}
