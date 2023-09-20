package Java_Course_DSA.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] ans = mergeTwoArray(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] mergeTwoArray(int[] arr1, int[] arr2) {
        int[] mergeArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergeArray[k] = arr1[i];
                i++;
            } else {
                mergeArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            mergeArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            mergeArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergeArray;
    }
}
