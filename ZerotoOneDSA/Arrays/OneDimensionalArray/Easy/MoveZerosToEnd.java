package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {3,5,0,0,4};
        int n = arr.length;
        int[] ans = moveZeros(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] moveZeros(int[] arr, int n) {
        int j = -1;

        //
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return arr;

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
