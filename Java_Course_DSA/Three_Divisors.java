package Java_Course_DSA;

// Three Divisors

public class Three_Divisors {
    public static void main(String[] args) {
        int n = 4;
        boolean answer = isThree(n);
        System.out.println(answer);
    }

    private static boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
                System.out.println(i);
            }
        }
        System.out.println(count);
        if (count == 3) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isThree_AnotherApproach(int n) {
        if (n <= 3) {
            return false;
        }
        int ans = 2;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int a = i;
                int b = n / a;
                if (a == b) {
                    ans++;
                } else {
                    ans += 2;
                }
            }
            if (ans > 3) {
                return false;
            }
        }
        return ans == 3;
    }
}
