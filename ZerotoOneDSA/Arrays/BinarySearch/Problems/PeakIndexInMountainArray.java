package ZerotoOneDSA.Arrays.BinarySearch.Problems;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0};
        int ans = peakElement(arr);
        System.out.println(ans);
    }

    static int peakElement(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;

        while (s < e) {
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        return s;
    }
}
