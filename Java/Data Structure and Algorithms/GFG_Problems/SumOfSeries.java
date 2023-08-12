package ThirtyDaysChallenge;

import java.util.Scanner;

// GFG = Sum of Series
// After some test cases it will give tle error so optimized version is also given

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long answer = seriesSum(N);
        System.out.println(answer);
    }

    private static long seriesSum(int n) {
//        long sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum += i;
//        }
//        return sum;

//        Optimized Solution
        long sum = ((long) n * (long) (n + 1)) / 2;
        return sum;
    }
}
