package Java_Course_DSA.Programs;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ansArray = reverseArray(arr);
        System.out.println("Using Swap Logic: " + Arrays.toString(ansArray));

        int[] ans = reverseArrayInBuiltMethod(arr);
        System.out.println("Using Collections Method: " + Arrays.toString(ans));
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

    private static int[] reverseArrayInBuiltMethod(int[] arr) {
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
}
