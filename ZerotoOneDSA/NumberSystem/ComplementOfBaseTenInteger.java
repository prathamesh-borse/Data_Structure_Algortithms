package ZerotoOneDSA.NumberSystem;

public class ComplementOfBaseTenInteger {
    public static void main(String[] args) {
        int n = 10;
        int ans = complementBaseTen(n);
        System.out.println(ans);
    }

    private static int complementBaseTen(int n) {
        int m = n;
        int mask = 0;

        while (m != 0) {
            mask = (mask << 1) | 1;
            m = m >> 1;
        }

        int ans = (~n) & mask;
        return ans;
    }
}
