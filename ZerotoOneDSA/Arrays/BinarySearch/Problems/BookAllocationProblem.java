package ZerotoOneDSA.Arrays.BinarySearch.Problems;

public class BookAllocationProblem {
    public static void main(String[] args) {
        int[] pages = {12, 34, 67, 90};
        int n = pages.length;
        int m = 5;
        int ans = allocateMinimumPages(pages, n, m);
        System.out.println(ans);
    }

    static boolean isPossible(int[] arr, int n, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < n; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            } else {
                studentCount++;
                if (studentCount > m || arr[i] > mid) {
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }

    static int allocateMinimumPages(int[] arr, int n, int m) {

        // base condition to return -1 if arr length will be less than the number of students
        if (n < m) {
            return -1;
        }

        int s = 0;
        int e = 0;
        for (int i = 0; i < n; i++) {
            e += arr[i];
        }
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans == -1 ? -1 : ans;
    }
}
