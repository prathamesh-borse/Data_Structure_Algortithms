package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 0};
        int n = arr.length;
        List<Integer> ans = findleaderfromArray(arr, n);
        System.out.println(Arrays.asList(ans));
    }

    static List<Integer> findleaderfromArray(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE, right = n - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = right; i >= 0; i--) {
            if (arr[i] > maxi) {
                ans.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
