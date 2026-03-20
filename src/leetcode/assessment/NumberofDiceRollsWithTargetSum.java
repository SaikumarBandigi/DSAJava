package leetcode.assessment;

public class NumberofDiceRollsWithTargetSum {

    public static void main(String[] args) {

        int n = 2;
        int k = 6;
        int target = 7;

        System.out.println(new NumberofDiceRollsWithTargetSum().solveRec(n, k, target));

    }

    public int solveRec(int n, int k, int target) {

        // Base cases
        if (n == 0 && target == 0) return 1;
        if (n == 0 || target < 0) return 0;

        int ways = 0;

        // Try all faces
        for (int face = 1; face <= k; face++) {
            ways += solveRec(n - 1, k, target - face);
        }

        return ways;
    }

}
