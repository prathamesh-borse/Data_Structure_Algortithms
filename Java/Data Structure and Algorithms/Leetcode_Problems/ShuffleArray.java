// Problem 1470 : Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/

// create new array with nums.length
// initialize the index variable with 0 which will be used to insert in the result array
// use the for loop to insert in the result array with following
// result[index++] = nums[i] = result[0] = nums[0]
// result[index++] = nums[i+n] = result[1] = nums[0+3]

// result[index++] = nums[i] = result[2] = nums[1]
// result[index++] = nums[i+n] = result[3] = nums[1+3]

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int size = nums.length;
//        int[] answer = shuffle(nums, n);
        int ans[] = new int[size];
        shuffle1(nums, n, ans);
        System.out.println(Arrays.toString(ans));
    }

//    public static int[] shuffle(int[] nums, int n) {
//        int[] result = new int[nums.length];
//        int index = 0;
//        for (int i = 0; i < n; i++) {
//            result[index++] = nums[i];
//            result[index++] = nums[i + n];
//        }
//        return result;
//    }


    public static void shuffle1(int[] nums, int n, int[] ans) {
        int i = 0;
        int j = n;
        int k = 0;
        while (i <= n && j < nums.length) {
            ans[k++] = nums[i];
            i++;
            ans[k++] = nums[j];
            j++;
        }
    }
}
