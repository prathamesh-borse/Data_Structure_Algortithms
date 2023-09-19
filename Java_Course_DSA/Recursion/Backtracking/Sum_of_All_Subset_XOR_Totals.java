package Java_Course_DSA.Recursion.Backtracking;

public class Sum_of_All_Subset_XOR_Totals {
    public static void main(String[] args) {
        int[] num = {5, 1, 6};
        int ans = subsetXORtotal(num);
        System.out.println(ans);
    }

    static int sum;

    public static void recur(int[] nums, int index, int xor) {
        if (index == nums.length) {
            sum += xor;
            return;
        }

        recur(nums, index + 1, xor ^ nums[index]);
        recur(nums, index + 1, xor);
    }

    public static int subsetXORtotal(int[] nums) {
        sum = 0;
        recur(nums, 0, 0);
        return sum;
    }
}
