package Java_Course_DSA.Programs;

import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
//        System.out.println(Arrays.asList(list));
    }

    private static void threeSum(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;

        int first = nums[0];
        int second = 0;
        int third = nums.length - 1;
        while (second < third) {
            if (first != second && first != third && second != third) {
                if (nums[first] + nums[second] + nums[third] == 0) {
                    System.out.print(nums[first] + " " + nums[second] + " " + nums[third]);
                }
            }
        }
    }
}
