package leetcode.arrayconcept;

import java.util.*;
import java.util.function.ToIntFunction;

public class SingleNumberIII {

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(new SingleNumberIII().singleNumber(nums)));

    }

    public int[] singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == 1) {
                set.add(key);
            }
        }

        ToIntFunction<Integer> toIntFunction = new ToIntFunction<>() {
            @Override
            public int applyAsInt(Integer value) {
                return value;
            }
        };

        return set.stream().mapToInt(toIntFunction).toArray();

    }

}
