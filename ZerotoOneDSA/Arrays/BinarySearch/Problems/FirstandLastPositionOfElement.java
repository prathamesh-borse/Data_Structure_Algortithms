package ZerotoOneDSA.Arrays.BinarySearch.Problems;

/* Coding Ninjas
https://www.codingninjas.com/studio/problems/first-and-last-position-of-an-element-in-sorted-array_1082549?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio2&leftPanelTab=0
 */

import java.util.ArrayList;
import java.util.List;

public class FirstandLastPositionOfElement {
    public static void main(String[] args) {
        int[] even = {1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 5};
        int n = even.length;
        int key = 3;
        int ans = firstOccurrence(even, n, key);
        System.out.println("3 is found at " + ans + " index.");

        int lastans = lastOccurrence(even, n, key);
        System.out.println("3 is found at " + lastans + " index.");
    }

    static int firstOccurrence(int[] arr, int size, int key) {
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;
        int ans = -1;
        while (start <= end) {
            if (arr[mid] == key) {
                ans = mid;
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    static int lastOccurrence(int[] arr, int size, int key) {
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;
        int ans = -1;
        while (start <= end) {
            if (arr[mid] == key) {
                ans = mid;
                start = mid + 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
}
