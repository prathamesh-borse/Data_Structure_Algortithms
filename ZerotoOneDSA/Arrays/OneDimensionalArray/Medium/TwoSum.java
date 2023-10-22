package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int n = 5;
        int k = 6;
        Integer[] ans = findTwoSumPointer(arr, n, k);
        System.out.println(Arrays.toString(ans));
    }

    static String findTwoSum(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int more = k - a;
            if (!map.containsKey(more)) {
                return "YES";
            }
            map.put(a, i);
        }
        return "NO";
    }

    static Integer[] findTwoSumPointer(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int more = k - a;
            if (map.containsKey(more)) {
                return new Integer[]{map.get(more), i};
            }
            map.put(a, i);
        }
        return new Integer[]{-1, -1};
    }
}
