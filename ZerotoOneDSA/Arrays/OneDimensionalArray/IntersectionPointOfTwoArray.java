package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionPointOfTwoArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        int[] brr = {2, 2, 3, 3};

        printArray(arr);
        printArray(brr);

        List<Integer> ans = findIntersection(arr, brr);
        System.out.println(Arrays.asList(ans));
    }

    static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                ans.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return ans;
    }

    static void printArray(int[] arr) {
        int size = arr.length;
        for (int s = 0; s < size; s++) {
            System.out.print(arr[s] + " ");
        }
        System.out.println();
    }
}
