package Java_Course_DSA.BinarySearch;

public class SumSquareNumbers {
    public static void main(String[] args) {
        int c = 5;
        boolean ans = judgeSquareSum(c);
        System.out.println(ans);
    }

    private static int sqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int s = 1;
        int e = x / 2;
        int result = 0;
        while (s <= e) {
            long mid = (long) (s + e) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                s = (int) (mid + 1);
                result = (int) mid;
            } else if (mid * mid > x) {
                e = (int) (mid - 1);
            }
        }
        return result;
    }

    private static boolean judgeSquareSum(int c) {
        if (c <= 2) {
            return true;
        } else if (c < 0) {
            return false;
        }

        int l = 0, r = sqrt(c);
        while (l <= r) {
            long ll = (long) l * l;  // Calculate squares using long to prevent overflow
            long rr = (long) r * r;
            long sum = ll + rr;

            if (sum == c) {
                return true;
            } else if (sum < c) {
                l++;
            } else {
                r--;
            }
        }
        return false;
    }
}
