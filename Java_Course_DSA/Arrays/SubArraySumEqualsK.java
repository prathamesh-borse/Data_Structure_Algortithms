package Java_Course_DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        // 1 2 3
        // 1 3 6
        // 0 1 2

        int k = 3;
        int ans = numsOfSubarrays(nums, k);
        System.out.println(ans);
    }

    private static int numsOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int ans = 0;

        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            ans += m.getOrDefault(sum - k, 0);
            m.put(sum, m.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
