package ZerotoOneDSA.Arrays.BinarySearch.Problems;

public class SqrtNumber {
    public static void main(String[] args) {
        int n = 37;
//        int ans = binarySearch(n);
//        System.out.println(ans);

        int tempSol = SqrtInteger(n);
        double ans = morePrecision(n, tempSol);
        System.out.println(ans);
    }

    public static int SqrtInteger(int x) {
        int s = 0;
        int e = x;
        long mid = s + (e - s) / 2;
        long ans = -1;
        while (s <= e) {
            long square = mid * mid;
            if (square == x) {
                return (int) mid;
            } else if (square <= x) {
                ans = mid;
                s = (int) (mid + 1);
            } else {
                e = (int) (mid - 1);
            }
            mid = s + (e - s) / 2;
        }
        return (int) ans;
    }

//    static int binarySearch(int x) {
//        int s = 0;
//        int e = x;
//        int mid = s + (e - s) / 2;
//        int ans = -1;
//        while (s <= e) {
//            int square = mid * mid;
//            if (square == x) {
//                return mid;
//            } else if (square < x) {
//                ans = mid;
//                s = mid + 1;
//            } else {
//                e = mid - 1;
//            }
//            mid = s + (e - s) / 2;
//        }
//        return ans;
//    }

    static double morePrecision(int n, int tempSol) {
        double factor = 1;
        double ans = tempSol;


        for (int i = 0; i < 3; i++) {
            factor = factor / 10;
            for (double j = ans; j * j < n; j = j + factor) {
                ans = j;
            }
        }
        return ans;
    }
}
