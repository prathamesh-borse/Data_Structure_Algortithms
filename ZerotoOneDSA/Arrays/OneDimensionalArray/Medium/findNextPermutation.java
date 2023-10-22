package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findNextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    static List<Integer> findNextPermutation(List<Integer> arr, int n) {
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) < arr.get(i + 1)) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            Collections.reverse(arr);
            return arr;
        }

        for (int i = n - 1; i > ind; i--) {
            if (arr.get(i) > arr.get(ind)) {
                int temp = arr.get(i);
                arr.set(i, arr.get(ind));
                arr.set(ind, temp);
                break;
            }
        }

        List<Integer> subList = arr.subList(ind + 1, n);
        Collections.reverse(arr);
        return arr;
    }


    public static void nextPermutation(int[] nums) {
        int n = nums.length, index = n - 2;
        while (index >= 0 && nums[index] >= nums[index + 1]) {
            index--;
        }

        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        int largeIndex = n - 1;
        while (nums[largeIndex] <= nums[index]) {
            largeIndex--;
        }

        int temp = nums[index];
        nums[index] = nums[largeIndex];
        nums[largeIndex] = temp;

        reverse(nums, index + 1, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
