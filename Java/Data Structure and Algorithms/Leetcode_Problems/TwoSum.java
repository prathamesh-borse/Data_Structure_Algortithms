import java.util.Arrays;

// 1. Two Sum

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoNums(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoNums(int[] nums, int target) {
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
