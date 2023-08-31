package Java_Course_DSA.Recursion;

public class MinCostClimbStairs {
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int ans = minCostClimbStairs(cost);
        System.out.println(ans);
    }

    private static int help(int i, int n, int[] dp) {
        if (i == n) return 0;
        if (i >= n) return 1000000;
        int x = help(i + 1, n, dp);
        int y = help(i + 2, n, dp);
        return dp[i] + Math.min(x, y);
    }

    private static int minCostClimbStairs(int[] nums) {
        int n = nums.length;
        return Math.min(help(0, n, nums), help(1, n, nums));
    }
}
