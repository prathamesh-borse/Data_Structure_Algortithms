package Java_Course_DSA.Programs;

import java.util.Arrays;

public class HowManyNumbersSmaller {
    public static void main(String[] args) {
        int[] nums = {7, 7, 7, 7};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int count;

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (j != i && nums[j] < nums[i]) {
                    count++;
                }
                ans[i] = count;
            }
        }
        return ans;
    }
}
