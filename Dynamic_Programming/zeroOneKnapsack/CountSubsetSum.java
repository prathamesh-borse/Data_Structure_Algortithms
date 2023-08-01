package Dynamic_Programming.zeroOneKnapsack;

public class CountSubsetSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 10};
        int n = arr.length;
        int sum = 10;
        int answer = countSubsetWithGivenSum(arr, sum, n);
        System.out.println("The count with given sum " + sum + " is: " + answer);
    }

    private static int countSubsetWithGivenSum(int[] arr, int sum, int n) {
        int[][] t = new int[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0)
                    t[i][j] = 0;
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

        return t[n][sum];
    }
}
