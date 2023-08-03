package ThirtyDaysChallenge;

// This problem uses two pointer approach
// using those two pointers variable traverse from left to right

// GFG = Binary Search

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 4;
        int answer = binarysearch(arr, n, k);
        System.out.println("The answer is: " + answer);
    }

    private static int binarysearch(int arr[], int n, int k) {
        int low = 0, high = n - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == k)
                return mid;

            else if (arr[mid] <= k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
