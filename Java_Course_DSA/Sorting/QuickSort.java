package Java_Course_DSA.Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        quickSort(a, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

    // Function to swap two elements in the array
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    private static int partition(int a[], int start, int end) {
        // currently choosing last element as pivot element
        int pivot = a[end];

        int position = start;
        int i = start;

        // Shift all elements less than the pivot element to left
        while (i < end) {
            if (a[i] < pivot) {
                swap(a, i, position);
                position++;
            }
            i++;
        }

        // Placing pivot element to it's correct position
        swap(a, end, position);
        return position;
    }

    private static void quickSort(int a[], int start, int end) {
        // base case
        if (start >= end) {
            return;
        }

        // Place the pivot element to it's correct position and return its index
        int indexOfPartition = partition(a, start, end);

        // first part of array - start to indexOfPartition-1
        quickSort(a, start, indexOfPartition - 1);

        // second part of array - indexOfPartition+1 to end
        quickSort(a, indexOfPartition + 1, end);
    }
}
