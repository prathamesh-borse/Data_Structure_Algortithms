package Java_Course_DSA.Arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] colors = sortColors(nums);
        System.out.println(Arrays.toString(colors));
    }

    private static int[] sortColors(int[] nums) {
        int size = nums.length;
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (nums[i] == 1) {
                oneCount++;
            } else if (nums[i] == 2) {
                twoCount++;
            }
        }

        int index = 0;
        while (zeroCount > 0) {
            nums[index] = 0;
            index++;
            zeroCount--;
        }

        while (oneCount > 0) {
            nums[index] = 1;
            index++;
            oneCount--;
        }

        while (twoCount > 0) {
            nums[index] = 2;
            index++;
            twoCount--;
        }
        return nums;
    }
}
