package Java_Course_DSA.Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        mergeSort(a, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // to divide the array into two parts
    private static void mergeSort(int[] a, int start, int end) {

        //base case
        if (start >= end) {
            return;
        }

        // recursive case
        int mid = (start + end) / 2;

        // start to mid -> First part of the array
        mergeSort(a, start, mid);

        // mid+1 to end -> Second part of the array
        mergeSort(a, mid + 1, end);

        // combine function to combine both parts in sorted order
        merge(a, start, end);
    }

    // combine function to combine both parts in sorted order
    private static void merge(int a[], int start, int end) {
        // start to mid -> First part of the array
        // mid+1 to end -> Second part of the array

        int mid = (start + end) / 2;
        int i = start;
        int j = mid + 1;

        // int resultArray[end-start+1];
        List<Integer> resultList = new ArrayList<>();

        while (i <= mid && j <= end) {
            if (a[i] <= a[j]) {
                // resultList.add(a[i]) --> JAVA
                resultList.add(a[i]);
                i++;
            } else {
                resultList.add(a[j]);
                j++;
            }
        }

        // if elements from the first part are remaining then we add them
        while (i <= mid) {
            resultList.add(a[i]);
            i++;
        }

        // if elements from the second part are remaining then we add them
        while (j <= end) {
            resultList.add(a[j]);
            j++;
        }

        // We need to copy the elements from resultArray to Original Array
        int index = start;
        for (int k = 0; k < resultList.size(); k++) {
            a[index] = resultList.get(k);
            index++;
        }
    }
}