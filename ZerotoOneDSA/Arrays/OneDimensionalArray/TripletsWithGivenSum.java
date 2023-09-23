package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 12;
        List<List<Integer>> ans = findTriplets(arr, k);
        System.out.println(Arrays.asList(ans));
    }

    static List<List<Integer>> findTriplets(int[] arr, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int l = j + 1; l < arr.length; l++) {
                    if (arr[i] + arr[j] + arr[l] == k) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[l]);
                        ans.add(temp);
                    }
                }
            }
        }
        return ans;
    }
}
