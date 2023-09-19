package Java_Course_DSA.Recursion;

import java.util.Arrays;

public class NthTribonacciNumber {
    public static void main(String[] args) {
        int n = 25;
        int ans = tribonacci(n);
        System.out.println(ans);
    }

//    private static int tribonacci(int n) {
//        int[] arr = new int[n + 1];
//        Arrays.fill(arr, -1);
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1 || n == 2) {
//            return 1;
//        }
//        if (arr[n] != -1)
//            return arr[n];
//        return tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
//    }

    static int[] dp;

    public static int recursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        int nthTerm = recursion(n - 1) + recursion(n - 2) + recursion(n - 3);
        dp[n] = nthTerm;
        return nthTerm;
    }

    public static int tribonacci(int n) {
        dp = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i] = -1;
        }
        return recursion(n);
    }
}
