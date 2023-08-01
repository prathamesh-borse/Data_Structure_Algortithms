package Dynamic_Programming.zeroOneKnapsack;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        int target = 3;
        int n = arr.length;
        int answer = targetSumWithDifference(arr, target, n);
        System.out.println("The number of expressions: " + answer);
    }

    private static int targetSumWithDifference(int[] arr, int target, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        if ((sum + target) % 2 != 0) {
            return 0;
        }

        int result = (target + sum) / 2;
        if (result < 0)
            return 0;

        int[][] t = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (j == 0)
                    t[i][j] = 1;
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j)
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                else
                    t[i][j] = t[i - 1][j];
            }
        }

        return t[n][result];
    }
}
