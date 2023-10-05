package ZerotoOneDSA.Arrays.BinarySearch.Problems;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 7, 10, 9};
        int n = arr.length;
        int k = 4;
        int ans = aggressiveCows(arr, n, k);
        System.out.println(ans);
    }

    static boolean isPossibleSolution(int[] arr, int k, int mid) {
        int cowCount = 1;
        int lastPos = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // here we are checking if the arr value and lastPos value distance will be greater than the mid
            // then we increase the cowCount
            if (arr[i] - lastPos >= mid) {
                cowCount++;
                // here we are checking if the cowCount will be equal to k
                if (cowCount == k) {
                    return true;
                }
                // changing the lastPos value according to arr[i] value
                lastPos = arr[i];
            }
        }
        return false;
    }

    static int aggressiveCows(int[] arr, int n, int k) {
        int s = 0;
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        int e = maxi;
        int mid = s + (e - s) / 2;
        int ans = -1;

        while (s <= e) {
            if (isPossibleSolution(arr, k, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }
}
