package Java_Course_DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 12, 1, 6};
        bubbleSort(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }

    private static void bubbleSort(int[] nums) {
        int n = nums.length - 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
