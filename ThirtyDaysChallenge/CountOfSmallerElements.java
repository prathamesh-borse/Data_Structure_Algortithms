package ThirtyDaysChallenge;

// GFG = Count of smaller elements
public class CountOfSmallerElements {
    public static void main(String[] args) {
        long[] arr = {1, 2, 4, 5, 8, 10};
        long N = arr.length;
        long X = 9;
        long answer = countOfElements(arr, N, X);
        System.out.println(answer);
    }

    private static long countOfElements(long[] arr, long n, long x) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                count++;
            }
        }
        return count;
    }
}
