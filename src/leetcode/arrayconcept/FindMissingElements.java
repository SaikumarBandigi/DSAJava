package leetcode.arrayconcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingElements {


    public static void main(String[] args) {
        int[] nums = {1, 5};
        System.out.println(new FindMissingElements().findMissingElements(nums));
    }

    public List<Integer> findMissingElements(int[] nums) {

        Set<Integer> elementSet = new HashSet<>();
        for (int num : nums) {
            elementSet.add(num);
        }

        int smallest = nums[0];
        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }

            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        List<Integer> missingElements = new ArrayList<>();
        for (int i = smallest + 1; i < largest; i++) {
            if (!elementSet.contains(i)) {
                missingElements.add(i);
            }
        }
        return missingElements;
    }

}
