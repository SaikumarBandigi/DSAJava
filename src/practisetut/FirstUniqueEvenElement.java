package practisetut;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstUniqueEvenElement {

    public static void main(String[] args) {

        int[] nums = {3, 4, 2, 5, 4, 6};
        System.out.println(new FirstUniqueEvenElement().firstUniqueEven(nums));

    }


    public int firstUniqueEven(int[] nums) {
        int res = -1;
        HashMap<Integer, Integer> map = new LinkedHashMap<>();

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
