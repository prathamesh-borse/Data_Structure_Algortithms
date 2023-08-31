package AtoZDSA;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 5;
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    private static boolean isPrime(int n) {
        int cnt = 0;
        if (n < 1) {
            return Boolean.parseBoolean("NO");
        }
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                cnt++;
                if (n / i != i) {
                    cnt++;
                }
            }
        }
        return (cnt == 2);
    }
}
