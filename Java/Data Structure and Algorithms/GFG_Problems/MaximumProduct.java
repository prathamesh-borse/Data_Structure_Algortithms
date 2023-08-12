package ThirtyDaysChallenge;

import java.util.Arrays;

// GFG = Maximum product of two numbers

public class MaximumProduct {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int n = arr.length;
        int answer = maxProduct(arr, n);
        System.out.println(answer);
    }

    private static int maxProduct(int[] arr, int n) {
        Arrays.sort(arr);
        int p = arr[n - 1] * arr[n - 2];
        return p;
    }
}
