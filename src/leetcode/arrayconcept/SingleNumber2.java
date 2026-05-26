package leetcode.arrayconcept;

import java.util.*;

public class SingleNumber2 {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 2, 3};
        System.out.println(new SingleNumber2().singleNumberUsingHashMap(nums));
        System.out.println(new SingleNumber2().singleNumberBitManipulation(nums));

    }

    public int singleNumberUsingHashMap(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // for(Map.Entry<Integer,Integer> entry:map.entrySet())
        // {
        //     if()
        // }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    public int singleNumberBitManipulation(int[] nums) {

        int ones = 0;
        int twos = 0;

        for (int num : nums) {

            // add bits appearing first time
            ones = (ones ^ num) & ~twos;

            // add bits appearing second time
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }

}


