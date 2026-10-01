package leetcode.dynamicprogrammingTut;

public class MinimumCostClimbingStairs {
    public static void main(String[] args) {

        int[] costs = {10, 15, 20};
        System.out.println(new MinimumCostClimbingStairs().getMinCostClimbingStairs(costs));

    }

    int getMinCostClimbingStairs(int[] costs) {

        int n = costs.length;
        int[] minCost = new int[n + 1];

        minCost[0] = 0;
        minCost[1] = 0;

        for (int i = 2; i <= n; i++) {
            minCost[i] = Math.min(costs[i - 1] + minCost[i - 1], costs[i - 2] + minCost[i - 2]);
        }
        return minCost[n];
    }
}
