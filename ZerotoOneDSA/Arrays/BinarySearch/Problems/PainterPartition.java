package ZerotoOneDSA.Arrays.BinarySearch.Problems;

public class PainterPartition {

    // 1 unit board ko paint krne me takes = 1 unit time lagta hai
    // Painter can paint continuous only

    public static void main(String[] args) {
        int[] boards = {48, 90};
        int n = boards.length;
        int k = 2;
        int ans = findLargestMinDistance(boards, n, k);
        System.out.println(ans);
    }

    static boolean isPossibleSolution(int[] arr, int n, int k, int mid) {
        int boardCount = 1;
        int boardSum = 0;

        for (int i = 0; i < n; i++) {
            if (boardSum + arr[i] <= mid) {
                boardSum += arr[i];
            } else {
                boardCount++;
                if (boardCount > k || arr[i] > mid) {
                    return false;
                }
                boardSum = arr[i];
            }
        }
        return true;
    }

    static int findLargestMinDistance(int[] arr, int n, int k) {
        int s = 0;
        int e = 0;
        for (int i = 0; i < n; i++) {
            e += arr[i];
        }
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossibleSolution(arr, n, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}


