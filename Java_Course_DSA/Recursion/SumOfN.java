package Java_Course_DSA.Recursion;

public class SumOfN {
    public static void main(String[] args) {
        int n = 5;
        int ans = sumOfNNaturalNumbers(n);
        System.out.println(ans);
    }

    private static int sumOfNNaturalNumbers(int n) {
        if (n == 1) {
            return n;
        }
        int partial_ans = sumOfNNaturalNumbers(n - 1);
        int total_sum = partial_ans + n;
        return total_sum;
    }
}

//1+2+3+4+5