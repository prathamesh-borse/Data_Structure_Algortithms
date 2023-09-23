package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        printArray(arr, 3);

        List<Integer> list = findAllDuplicates(arr, 3);
        System.out.println(Arrays.asList(list));
    }

    static List<Integer> findAllDuplicates(int[] nums, int size) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                ans.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        return ans;
    }

    // arr length will be from 1 to n the below solution will not work
//    static List<Integer> findAllDuplicates(int[] arr, int size) {
//        List<Integer> ans = new ArrayList<>();
//
//        for (int i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (arr[i] == arr[j]) {
//                    ans.add(arr[i]);
////                    System.out.println(ans.add(arr[i]));
//                }
//            }
//        }
//        Collections.sort(ans);
//        return ans;
//    }


    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
