package ZerotoOneDSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 11, 23, 5, 20};
        int n = arr.length;
        int[] ans = insertionSort(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
