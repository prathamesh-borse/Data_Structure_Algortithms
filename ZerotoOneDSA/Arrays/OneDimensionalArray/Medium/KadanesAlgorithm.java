package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        Long ans = useKadanesAlgorithm(arr, n);
        System.out.println(ans);
    }

    static long useKadanesAlgorithm(int[] arr, int n) {
        long sum = 0, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        if (maxi < 0) {
            maxi = 0;
        }
        return maxi;
    }
}
