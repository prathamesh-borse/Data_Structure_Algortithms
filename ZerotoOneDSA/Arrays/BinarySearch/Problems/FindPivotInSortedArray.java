package ZerotoOneDSA.Arrays.BinarySearch.Problems;

public class FindPivotInSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 10, 17, 1};
        int ans = getPivot(arr, 5);
        System.out.println("Pivot is: " + ans);
    }

    static int getPivot(int[] arr, int n) {
        int s = 0;
        int e = n - 1;
        int mid = s + (e - s) / 2;
        while (s < e) {
            if (arr[mid] >= arr[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        return s;
    }
}
