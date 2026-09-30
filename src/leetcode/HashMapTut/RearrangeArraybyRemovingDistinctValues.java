package leetcode.HashMapTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class RearrangeArraybyRemovingDistinctValues {

    public static void main(String[] args) {

        //  1  2  3   1  3    3

        int[] arr = {3, 1, 3, 2, 1, 3};
        System.out.println(Arrays.toString(new RearrangeArraybyRemovingDistinctValues().rearrangeArray(arr)));

    }

    public int[] rearrangeArray(int[] nums) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        while (!map.isEmpty()) {
            List<Integer> list = new ArrayList<>(map.keySet());
            for (int key : list) {
                result.add(key);
                if (map.get(key) == 1) {
                    map.remove(key);
                } else {
                    map.put(key, map.get(key) - 1);
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}
