package ZerotoOneDSA.Arrays.OneDimensionalArray;

public class findNumberAppearOneTime {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        int n = arr.length;
        int ans = numberAppearsOneTime(arr, n);
        System.out.println(ans);
    }

    static int numberAppearsOneTime(int[] arr, int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
