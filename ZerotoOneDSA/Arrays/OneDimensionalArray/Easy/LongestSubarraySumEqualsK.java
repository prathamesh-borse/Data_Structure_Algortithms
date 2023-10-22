package ZerotoOneDSA.Arrays.OneDimensionalArray;

import ZerotoOneDSA.Sorting.InsertionSort;

import java.util.HashMap;

public class LongestSubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int n = 7;
        int k = 3;
        int ans = longestSubarray(arr, n, k);
        System.out.println(ans);
    }

    static int longestSubarray(int[] arr, int n, int k) {
        HashMap<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            long rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }

    static int longestSubarrayTwoPointer(int[] arr, int n, int k) {
        int left = 0, right = 0;
        long sum = arr[0];
        int maxLen = 0;
        // moving to the right
        while (right < n) {
            // checking if the pointer is not go beyond array element and also checking
            // if the sum is greater than the k (sum)
            while (left <= right && sum > k) {
                // if it does then we will minus that element from the sum
                sum -= arr[left];
                // increases the left
                left++;
            }

            // if we found that sum is equal to k
            if (sum == k) {
                // replace maxLen by finding max
                maxLen = Math.max(maxLen, right - left + 1);
            }
            // increases the right
            right++;
            // check condition till not exceeds the array element
            if (right < n) {
                // right to be added inside the sum
                sum += arr[right];
            }
        }
        return maxLen;
    }

}
