package Dynamic_Programming.zeroOneKnapsack;

/*
* This question is same as equal sum partition
* but in this we calculate the sum (that is range)
* here we find only one subset then next will be automatically found (range - s1) = s2
* assign the ans variable value with maximum value
* we find the minimum value in that we add the ans which is maximum value and also
* find the absolute value from sum - 2 * j
* */


public class MinimumSubsetSumDifference {
    public static void main(String[] args) {
        int[] arr = {1, 6, 11, 5};
        int n = arr.length;
        int answer = minimumSubsetSumDifference(arr, n);
        System.out.println("The subset sum with given difference: " + answer);
    }

    private static int minimumSubsetSumDifference(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        boolean[][] t = new boolean[n + 1][sum + 1];

        // Initializing Subset Sum Table
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                // If there is no element in the array, no subset sum is possible except one
                // case when sum = 0
                if (i == 0) {
                    t[i][j] = false;
                }
                if (j == 0) {
                    t[i][j] = true; // Sum zero is possible for every array size
                }
            }
        }

        // Filling up the table
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = (t[i - 1][j - arr[i - 1]] || t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        int ans = Integer.MAX_VALUE;

        // All the subset sum which is possible for this n sized array will have true value
        // in table in nth row
        for (int j = 0; j < sum + 1; j++) // Iterating last row where the sum exists
        {
            // abs(sum - 2*(subset_sum) will give subset sum difference
            if (t[n][j]) {
                ans = Math.min(ans, Math.abs(sum - 2 * j));
            }
        }
        return ans;
    }
}
