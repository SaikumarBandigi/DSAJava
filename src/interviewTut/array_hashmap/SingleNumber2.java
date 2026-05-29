package interviewTut.array_hashmap;

// Every element appears 3 times except one.

import java.util.HashMap;
import java.util.Map;

public class SingleNumber2 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3};
        System.out.println(new SingleNumber2().singleNumber2(arr));
    }

    public int singleNumber2(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

}
