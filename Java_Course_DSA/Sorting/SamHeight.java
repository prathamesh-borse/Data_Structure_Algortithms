package Java_Course_DSA.Sorting;

import java.util.Arrays;

public class SamHeight {
    public static void main(String[] args) {
        int[] nums = {4, 3, 1};
        int S = 2;
        int ans = samHeight(nums, S);
        System.out.println(ans);
    }

    public static int samHeight(int[] nums, int S) {
        int lessHeightCount = 0;
        int moreHeightCount = 0;
        Arrays.sort(nums);
        // Step 1: Iterate through nums array
        for (int num : nums) {
            if (num < S) {
                lessHeightCount++;
            } else if (num >= S) {
                moreHeightCount++;
            }
        }

        int absolutedifference = Math.abs(moreHeightCount - lessHeightCount);
        System.out.println(absolutedifference);
        return absolutedifference;
    }
}
