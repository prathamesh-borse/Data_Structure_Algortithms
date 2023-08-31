package Java_Course_DSA.Recursion;

public class ClimibingStairs {
    public static void main(String[] args) {
        int n = 3;
        int ans = climbStairs(n);
        System.out.println(ans);
    }

    private static int help(int i, int n, int[] dp) {
        if (i >= n - 1) return 1;
        if (dp[i] != -1) return dp[i];
        int x = help(i + 1, n, dp);
        int y = help(i + 2, n, dp);
        dp[i] = x + y;
        return x + y;
    }

    private static int climbStairs(int n) {
        int[] dp = new int[n];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return help(0, n, dp);
    }
}
