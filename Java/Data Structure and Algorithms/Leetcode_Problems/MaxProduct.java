
/*
 * 1464. Maximum Product of Two Elements in an Array
 *
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 *
 * Use two for loop to traverse the index = i and j
 * and calculate the maximum number from (nums[i]-1)*(nums[j]-1)
 *
 * */


public class MaxProduct {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 5};
        int answer = maxProduct(nums);
        System.out.println(answer);
    }

    public static int maxProduct(int[] nums) {
        int product = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                product = Math.max(product, (nums[i] - 1) * (nums[j] - 1));
            }
        }
        return product;
    }
}
