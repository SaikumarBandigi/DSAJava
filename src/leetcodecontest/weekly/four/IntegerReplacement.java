package leetcodecontest.weekly.four;

public class IntegerReplacement {

    public static void main(String[] args) {

        int n = 4; // 4 -> 2 -> 1
        System.out.println(new IntegerReplacement().integerReplacementTLE(n));

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

}
