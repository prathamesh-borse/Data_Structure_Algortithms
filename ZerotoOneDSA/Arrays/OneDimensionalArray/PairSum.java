package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2, -3, 3, 3, -2};
        int s = 0;
        List<List<Integer>> ans = findPairSum(arr, s);
        System.out.println(Arrays.asList(ans));
    }

    static List<List<Integer>> findPairSum(int[] arr, int s) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                List<Integer> temp = new ArrayList<>();
                if (arr[i] + arr[j] == s) {
                    temp.add(Math.min(arr[i], arr[j]));
                    temp.add(Math.max(arr[i], arr[j]));
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
