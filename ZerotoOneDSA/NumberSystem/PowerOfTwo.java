package ZerotoOneDSA.NumberSystem;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 0;
        boolean ans = powerOfTwoOptimized(n);
        System.out.println(ans);
    }

    static boolean powerOfTwo(int n) {
        for (int i = 0; i <= 30; i++) {
            int ans = (int) (Math.pow(2, i));
            if (ans == n) {
                return true;
            }
        }
        return false;
    }


    static boolean powerOfTwoOptimized(int n) {
        int ans = 1;
        for (int i = 0; i <= 30; i++) {
            if (ans == n) {
                return true;
            }

            ans = ans * 2;
        }
        return false;
    }
}
