package Java_Course_DSA.NumberSystem;

public class ExceptionallyOdd {
    public static void main(String[] args) {
        int[] nums = {5, 7, 2, 7, 5, 2, 5};
        int ans = exceptionallyOdd(nums);
        System.out.println(ans);
    }

    private static int exceptionallyOdd(int[] nums) {
        int size = nums.length;
        int ans = 0;
        for (int i = 0; i < size; i++) {
            ans = ans ^ nums[i];
        }

        return ans;
    }
}
