package ZerotoOneDSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {29, 72, 98, 13, 87, 66, 52, 51, 36};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
