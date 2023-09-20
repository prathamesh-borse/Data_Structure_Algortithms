package Java_Course_DSA.Programs;

/*
 * Carry a bag with you and create new variable for max_sum
 * and traverse till nums array add the nums[j] element inside the bag
 * for(int i: nums) bag += i;
 * in the if condition check If the bag size is greater than then update max_Sum with bag
 * add another condition in the to check if the sum is negative then empty the bag and assign bag to 0.
 *
 * */

public class MaximumSubarrays {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = maxSubArray(nums);
        System.out.println(ans);
    }

    private static int maxSubArray(int[] nums) {
        int bag = 0;
        int max_Sum = Integer.MIN_VALUE;
        for (int i : nums) {
            bag += i;
            if (bag > max_Sum) max_Sum = bag;
            if (bag < 0) bag = 0;
        }
        return max_Sum;

    }
}