package leetcodecontest.weekly.four;

import java.util.HashMap;
import java.util.Map;

public class IntegerReplacement {

    public static void main(String[] args) {

        int n = 4; // 4 -> 2 -> 1
        System.out.println(new IntegerReplacement().integerReplacementTLE(n));
        System.out.println(new IntegerReplacement().integerReplacement(n));
    }

    public int integerReplacementTLE(int num) {

        // base case
        if (num == 1) return 0;

        // even case
        if (num % 2 == 0) {
            return 1 + integerReplacementTLE(num / 2);
        }

        // odd case → try both +1 and -1
        return 1 + Math.min(integerReplacementTLE(num + 1), integerReplacementTLE(num - 1));
    }

    private Map<Long, Integer> memo = new HashMap<>();

    public int integerReplacement(int n) {
        return solve(n);
    }

    private int solve(long num) {

        if (num == 1) return 0;

        if (memo.containsKey(num)) {
            return memo.get(num);
        }

        int result;

        if (num % 2 == 0) {
            result = 1 + solve(num / 2);
        } else {
            result = 1 + Math.min(solve(num + 1), solve(num - 1)
            );
        }

        memo.put(num, result);
        return result;
    }

}
