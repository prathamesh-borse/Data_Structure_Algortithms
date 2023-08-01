package Dynamic_Programming.zeroOneKnapsack;

public class ZeroOneKnapsack {
    public static void main(String[] args) {

        int wt[] = {10, 20, 30};
        int n = wt.length;
        int val[] = {60, 100, 120};
        int W = 50;
        int answer = maxProfitDP(wt, val, W, n);
        System.out.println(answer);
    }

    private static int maxProfitRecursive(int wt[], int val[], int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n - 1] > W) {
            return maxProfitRecursive(wt, val, W, n - 1);

        } else {
            return Math.max(val[n - 1]
                            + maxProfitRecursive(wt, val, W - wt[n - 1], n - 1),
                    maxProfitRecursive(wt, val, W, n - 1));
        }
    }

    private static int maxProfitMemoized(int wt[], int val[], int W, int n) {
        int[][] t = new int[n + 1][W + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < W; j++) {
                t[i][j] = -1;
            }
        }

        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n - 1] > W) {
            return t[n][W] = maxProfitMemoized(wt, val, W, n - 1);
        } else {
            return t[n][W] = Math.max(val[n - 1] + maxProfitMemoized(wt, val, W - wt[n - 1], n - 1), maxProfitMemoized(wt, val, W, n - 1));
        }
    }

    private static int maxProfitDP(int[] wt, int[] val, int W, int n) {
        int i, j;
        int t[][] = new int[n + 1][W + 1];

        // Build table t[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= W; j++) {
                if (i == 0 || j == 0)
                    t[i][j] = 0;
                else if (wt[i - 1] <= j)
                    t[i][j] = Math.max(val[i - 1]
                                    + t[i - 1][j - wt[i - 1]],
                            t[i - 1][j]);
                else
                    t[i][j] = t[i - 1][j];
            }
        }

        return t[n][W];
    }
}