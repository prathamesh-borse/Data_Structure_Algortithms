package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.Arrays;

// Dutch National Flag Algorithm

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 2, 1, 0, 0, 1};
        int[] ans = sortZeroOneTwo(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sortZeroOneTwo(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low = low + 1;
                mid = mid + 1;
            } else if (arr[mid] == 1) {
                mid = mid + 1;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high = high - 1;
            }
        }
        return arr;
    }
}
