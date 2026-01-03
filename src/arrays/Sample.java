package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 1, 2, 6};
        findDuplicate(a);

    }

    private static void findDuplicate(int[] a) {

        HashMap<Integer, Integer> values = new HashMap<>();

        for (int num : a) {
            values.put(num, values.getOrDefault(num, 0) + 1);
        }

        for (Integer key : values.keySet()) {
            if (values.get(key) > 1) {
                System.out.println(key);
            }
        }


    }
}
