package Java_Course_DSA.Arrays;

import java.util.Arrays;

public class Maximum_Product_Difference {
    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
        int answer = maximumProductDifference(nums);
        System.out.println(answer);
    }

    private static int maximumProductDifference(int[] nums) {
        Arrays.sort(nums);
        int prod1 = nums[0] * nums[1];
        int prod2 = nums[nums.length - 1] * nums[nums.length - 2];
        return prod2 - prod1;
    }
}
