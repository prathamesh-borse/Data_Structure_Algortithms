package Java_Course_DSA.NumberSystem;

public class SingleNumberUsingXOR {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }

    private static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
