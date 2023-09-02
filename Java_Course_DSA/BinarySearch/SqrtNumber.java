package Java_Course_DSA.BinarySearch;

public class SqrtNumber {
    public static void main(String[] args) {
        int n = 2147395599;
        int ans = sqrtBinarySearch(n);
        System.out.println(ans);
    }

    private static int sqrtBinarySearch(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int s = 1;
        int e = x / 2;
        int result = 0;
        while (s <= e) {
            long mid = (s + e) / 2;
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
}
