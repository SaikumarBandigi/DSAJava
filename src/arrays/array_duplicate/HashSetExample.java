package arrays.array_duplicate;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 2, 3, 3};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (hashMap.containsKey(a[i])) {
                int freq = hashMap.get(a[i]);
                hashMap.put(a[i], freq + 1);

            } else {
                hashMap.put(a[i], 1);
            }
        }

        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) > 1)
                System.out.println(key + " " + hashMap.get(key));
        }

    }
}
