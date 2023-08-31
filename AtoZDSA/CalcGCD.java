package AtoZDSA;

public class CalcGCD {
    public static void main(String[] args) {
        int n = 6;
        int m = 4;
        int ans = calcGCD(n, m);
        System.out.println(ans);
    }

    private static int calcGCD(int a, int b) {
        while ((a > 0) && (b > 0)) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
}
