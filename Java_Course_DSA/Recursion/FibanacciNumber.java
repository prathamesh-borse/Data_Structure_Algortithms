package Java_Course_DSA.Recursion;

public class FibanacciNumber {
    public static void main(String[] args) {
        int n = 4;
        int ans = fib(n);
        System.out.println(ans);
    }

    private static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
