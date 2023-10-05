package ZerotoOneDSA.Arrays.BinarySearch.Problems;

/*
* https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
* */

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;
        int ans = search(arr, key);
        System.out.println(ans);
    }

    static int getPivot(int[] arr, int n) {
        int s = 0;
        int e = n - 1;
        int mid = s + (e - s) / 2;
        while (s < e) {
            if (arr[mid] > arr[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        return s;
    }

    static int binarySearch(int[] arr, int start, int end, int k) {
        int s = start;
        int e = end;
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (arr[mid] == k) {
                return mid;
            } else if (k > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return -1;
    }


    static int search(int[] arr, int key) {
        int n = arr.length;
        int pivot = getPivot(arr, n);
        if (key >= arr[pivot] && key <= arr[n - 1]) {
            // find pivot on second line
            return binarySearch(arr, pivot, n - 1, key);
        } else {
            // find pivot on first line
            return binarySearch(arr, 0, pivot - 1, key);
        }
    }
}
