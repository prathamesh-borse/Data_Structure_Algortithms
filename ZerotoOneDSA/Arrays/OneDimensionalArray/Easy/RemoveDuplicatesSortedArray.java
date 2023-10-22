package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.ArrayList;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5};
        int n = arr.length;
        int ans = removeDuplicates(arr, n);
        System.out.println(ans);
    }

    static int removeDuplicates(int[] a, int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (a[j] != a[i]) {
                a[i + 1] = a[j];
                i++;
            }
        }
        return (i + 1);
    }
}
