package ThirtyDaysChallenge;

// GFG = Product of array elements
// We have to calculate the product of array elements and also we have modulo for it using that we have to
// calculate it.

public class ProductOfArrayElements {
    public static void main(String[] args) {
        Long[] arr = {1L, 2L, 3L, 4L};
        int n = arr.length;
        Long mod = 1000007L;
        Long answer = product(arr, mod, n);
        System.out.println(answer);
    }

    private static Long product(Long[] arr, Long mod, int n) {
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans = (ans * arr[i]) % mod;
        }
        return ans;
    }
}
