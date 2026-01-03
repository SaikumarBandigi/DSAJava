package leetcode.arrayconcept;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2};
        System.out.println(new MajorityElement().majorityElementBoyerMoore(nums));
    }

    public int majorityElement(int[] nums) {
        int n = nums.length;

        int t = (n / 2);

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (map.get(entry.getKey()) > t) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public int majorityElementBoyerMoore(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;

            }
        }
        return candidate;
    }


}
