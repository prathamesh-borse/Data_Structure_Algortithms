package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.Arrays;

public class LeftRotateArraybyDPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 3;
        int[] ans = rotateArray(arr, n, d);
        System.out.println(Arrays.toString(ans));
    }

    static int[] rotateArray(int[] arr, int n, int d) {
        d = d % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        return arr;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
