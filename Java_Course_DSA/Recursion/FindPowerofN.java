package Java_Course_DSA.Recursion;

public class FindPowerofN {
    public static void main(String[] args) {
        Double x = 2.00000;
        int n = -2;
        Double ans = pow(x, n);
        System.out.println(ans);
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
}
