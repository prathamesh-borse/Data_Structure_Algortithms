package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] ans = leftRotate(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] leftRotate(int[] a, int n) {
        int temp = a[0];
        for (int i = 1; i < n; i++) {
            a[i - 1] = a[i];
        }
        a[n - 1] = temp;
        return a;
    }
}
