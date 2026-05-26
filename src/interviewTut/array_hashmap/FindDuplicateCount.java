package interviewTut.array_hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateCount {

    public static void main(String[] args) {
        int[] ar = {1, 1, 2, 2, 2, 3};
        new FindDuplicateCount().findDuplicateCount(ar);
    }

    void findDuplicateCount(int[] nums) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }

}
