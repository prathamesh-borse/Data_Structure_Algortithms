package Java_Course_DSA.Recursion;

public class FindPowerofN {
    public static void main(String[] args) {
        Double x = 2.00000;
        int n = -2;
        Double ans = myPow(x, n);
        System.out.println(ans);
        // x^n = x^n-1 * n
    }

    private static double helper(double x, int n) {
        if (n <= 0) {
            return 1;
        }
        return x * helper(x, n - 1);
    }

    private static double pow(double x, int n) {
        // Call helper method to calculate the power
        double result = helper(x, Math.abs(n));

        // If n is negative
        if (n < 0)
            result = 1 / result;

        return result;
    }

    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private static double fastPow(double x, long n) {
        if (n == 0) return 1.0;
        double partial_ans = fastPow(x, n / 2);
        if (n % 2 != 0) {
            return partial_ans * partial_ans * x;
        } else {
            return partial_ans * partial_ans;
        }
    }
}


