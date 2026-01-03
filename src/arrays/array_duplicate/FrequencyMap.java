package arrays.array_duplicate;

import java.util.*;

public class FrequencyMap {
    public static void main(String[] args) {

        int[] a = {1, 2, 1};
        findDuplicatesUsingHashMap(a);
    }

    private static void findDuplicatesUsingHashMap(int[] a) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();


        for (int i = 0; i < a.length; i++) {
            hashMap.put(a[i], hashMap.getOrDefault(a[i], 0) + 1);
        }


        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }

    }

}
