package Java_Course_DSA.Recursion;

public class FacN {
    public static void main(String[] args) {
        int n = 5;
        int ans = factorialUsingrecursion(n);
        System.out.println(ans);
    }

    private static int factorialUsingrecursion(int n) {
        if (n == 1) {
            return 1;
        }
        int partial_ans = factorialUsingrecursion(n - 1);
        int total_ans = partial_ans * n;
        return total_ans;
    }
}