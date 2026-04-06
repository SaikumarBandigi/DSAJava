package leetcodecontest.weekly.four96;

import java.util.*;

public class IntegersWithMultipleSumofTwoCubes {
    public static void main(String[] args) {

        int n = 4104;
        System.out.println(new IntegersWithMultipleSumofTwoCubes().findGoodIntegers(n));

    }

    public List<Integer> findGoodIntegers(int n) {
        Map<Integer, Integer> map = new HashMap<>();

        int limit = (int) Math.cbrt(n); // cube root

        for (int a = 1; a <= limit; a++) {
            int aCube = a * a * a;

            for (int b = a; b <= limit; b++) {
                int sum = aCube + b * b * b;

                if (sum > n) break;

                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);

        return result;
    }


}
