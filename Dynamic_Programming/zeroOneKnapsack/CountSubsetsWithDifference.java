package Dynamic_Programming.zeroOneKnapsack;

public class CountSubsetsWithDifference {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        int difference = 1;
        int n = arr.length;
        int answer = countSubsets(arr, n, difference);
        System.out.println("The number of subsets are: " + answer);
    }

    private static int countSubsets(int[] arr, int n, int diff) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        int val = (sum + diff) / 2;
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

        return t[n][val];
    }
}
