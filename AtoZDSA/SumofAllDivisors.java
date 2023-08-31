package AtoZDSA;

public class SumofAllDivisors {
    public static void main(String[] args) {
        int n = 10;
        sumofAllDivisors(n);
//        System.out.println(ans);
    }

    private static void sumofAllDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

        }
        System.out.println("sum of all divisors: " + sum);
    }
}
