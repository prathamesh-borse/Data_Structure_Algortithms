package Java_Course_DSA.Recursion;

import java.util.Arrays;

public class MinCostClimbStairs {
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int ans = minCostClimbStairs(cost);
        System.out.println(ans);
    }

    public static int helper(int index, int[] cost, int[] dp) {
        if (index == cost.length)
            return 0;
        if (index > cost.length)
            return Integer.MAX_VALUE;
        if (dp[index] != -1) return dp[index];
        int c = cost[index];
        int step1 = helper(index + 1, cost, dp);
        int step2 = helper(index + 2, cost, dp);
        dp[index] = c + Math.min(step1, step2);
        return dp[index];
    }

    private static int minCostClimbStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        Arrays.fill(dp, -1);
        int step_first = helper(0, cost, dp);
        int step_second = helper(1, cost, dp);
        return Math.min(step_first, step_second);
    }
}
