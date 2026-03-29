package leetcode.HashTableConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Unique3DigitEvenNumbers {
    public static void main(String[] args) {

        int[] digits = {0, 2, 2};
        System.out.println(new Unique3DigitEvenNumbers().totalNumbers(digits));

    }

    public int totalNumbers(int[] digits) {

        // Step 1: Frequency map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int d : digits) {
            freq.put(d, freq.getOrDefault(d, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        // Step 2: Check all 3-digit numbers
        for (int num = 100; num <= 999; num++) {

            if (num % 2 != 0) continue; // must be even

            int h = num / 100;
            int t = (num / 10) % 10;
            int o = num % 10;

            Map<Integer, Integer> temp = new HashMap<>();

            temp.put(h, temp.getOrDefault(h, 0) + 1);
            temp.put(t, temp.getOrDefault(t, 0) + 1);
            temp.put(o, temp.getOrDefault(o, 0) + 1);

            boolean valid = true;

            for (int key : temp.keySet()) {
                if (temp.get(key) > freq.getOrDefault(key, 0)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(num);
            }
        }

        return result.size();
    }

}
