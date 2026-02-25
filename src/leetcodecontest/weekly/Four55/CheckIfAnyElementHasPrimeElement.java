package leetcodecontest.weekly.Four55;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckIfAnyElementHasPrimeElement {
    public static void main(String[] args) {

        int[] nums = new int[31];
        Arrays.fill(nums, 1);
        /*

        1 - 1
        2 - 1
        3 - 1
        4 - 2
        5 - 1

         */
        System.out.println(checkPrimeFrequency(nums));
    }

    public static boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int value : map.values()) {
            if (isPrime(value)) {
                return true;
            }
        }
        return false;
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;

        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

}
