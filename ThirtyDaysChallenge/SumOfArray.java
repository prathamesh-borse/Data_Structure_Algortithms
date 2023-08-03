package ThirtyDaysChallenge;

// GFG = Sum of Array Elements Long

public class SumOfArray {
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4};
        long n = arr.length;
        long answer = getSum(arr, n);
        System.out.println(answer);
    }

    private static long getSum(long[] a, long n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }
}
