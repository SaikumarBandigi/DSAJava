package leetcodecontest.biweekly.one77;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4};
        System.out.println(Arrays.toString(get(nums))); // 1 3

        /*

        1 -> 2
        2 -> 2
        3 -> 1
        4 -> 1

         */
    }

    static int[] get(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[2];
        boolean found = false;

        List<Integer> keys = new ArrayList<>(map.keySet());  // 1 2 3 4

        for (int i = 0; i < keys.size(); i++) {
            for (int j = i + 1; j < keys.size(); j++) {
                int num1 = keys.get(i);
                int num2 = keys.get(j);

                int freq1 = map.get(num1);
                int freq2 = map.get(num2);

                if (num2 > num1 && freq1 != freq2) {
                    res[0] = num1;
                    res[1] = num2;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        return found ? res : new int[]{-1, -1};
    }


}
