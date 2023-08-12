package ThirtyDaysChallenge;

// GFG = Sum of Array Elements Integer

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int answer = getSum(arr, n);
        System.out.println(answer);
    }

    private static int getSum(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }
}
