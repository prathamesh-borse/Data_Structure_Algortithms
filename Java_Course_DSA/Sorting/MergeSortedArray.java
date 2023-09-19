package Java_Course_DSA.Sorting;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 5, 6};
        int[] ans = merge(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        // Create a result array to store the merged elements
        int[] result = new int[nums1.length + nums2.length];

        // Merge the two sorted arrays using the merge sort logic
        mergeSort(nums1, 0, nums1.length - 1);
        mergeSort(nums2, 0, nums2.length - 1);

        int i = 0, j = 0, k = 0;

        // Merge the two sorted arrays into the result array
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Copy any remaining elements from nums1
        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }

        // Copy any remaining elements from nums2
        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }

        return result;
    }

    // Merge sort function
    private static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    // Merge function
    private static void merge(int[] a, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = a[start + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = a[mid + 1 + i];
        }

        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        while (i < n1) {
            a[k++] = left[i++];
        }

        while (j < n2) {
            a[k++] = right[j++];
        }
    }
}
