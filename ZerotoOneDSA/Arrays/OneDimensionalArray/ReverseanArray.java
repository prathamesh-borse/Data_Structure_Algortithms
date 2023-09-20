package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.Arrays;

public class ReverseanArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] answer = reverseArray(arr);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
}
