package apple.practise;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueEvenElement {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(new FirstUniqueEvenElement().firstUniqueEven(nums));

    }
    /*

    1 - 2
    2 - 1
    3 - 2
    4 - 1
    5 - 2
    6 - 2

     */

    public int firstUniqueEven(int[] nums) {

        int res = -1;

        Map<Integer, Integer> map = new LinkedHashMap<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (isEven(num)) {
                if (map.get(num) == 1) {
                    res = num;
                    break;
                }
            }
        }
        return res;
    }

    boolean isEven(int num) {
        return (num & 1) == 0;
    }

}
