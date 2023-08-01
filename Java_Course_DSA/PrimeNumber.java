import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean answer = isPrime(num);
        System.out.println(answer);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // i = 2, 12/2 = 6, 2 <= 6 = yes
        // 12 % 2 == 0
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
