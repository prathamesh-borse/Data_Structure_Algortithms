package Java_Course_DSA.Sorting;

import java.util.ArrayList;
import java.util.List;

public class CountInversionsofanArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        long ans = inversionCount(arr);
        System.out.println(ans);
    }

    private static long merge(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        int i = start;
        int j = mid + 1;

        List<Integer> resultList = new ArrayList<>();
        long numOfInversionCount = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                resultList.add(arr[i]);
                i++;
            } else {
                numOfInversionCount += (mid - i + 1);
                resultList.add(arr[j]);
                j++;
            }
        }

        while (i <= mid) {
            resultList.add(arr[i]);
            i++;
        }

        while (j <= end) {
            resultList.add(arr[j]);
            j++;
        }

        int index = start;
        for (int k = 0; k < resultList.size(); k++) {
            arr[index] = resultList.get(k);
            index++;
        }
        return numOfInversionCount;
    }

    private static long mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return 0;
        }

        int mid = (start + end) / 2;
        long leftInversion = mergeSort(arr, start, mid);
        long rightInversion = mergeSort(arr, mid + 1, end);
        long currentInversion = merge(arr, start, end);
        long finalAnswer = leftInversion + rightInversion + currentInversion;
        return finalAnswer;
    }


    private static long inversionCount(int[] arr) {
        int n = arr.length;
        return mergeSort(arr, 0, n - 1);
    }


}
