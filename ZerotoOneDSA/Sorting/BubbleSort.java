package ZerotoOneDSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 2, 13, 34, 45};
        bubbleSort(arr, 7);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int size) {
        // for round 1 to n -1
        for (int i = 1; i < size; i++) {
            // for process index till n - i th index
            // to check if the array is already sorted or not
            boolean swapped = false;
            for (int j = 0; j < size - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // here we are checking if the array is already sorted, then there is
            // no swapping happens hence we directly break the loop
            if (swapped == false) {
                break;
            }
        }
    }
}


// i = 0 to n - 1
// j = 0 to n - i - 1
