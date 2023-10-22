package ZerotoOneDSA.Arrays.OneDimensionalArray;

import java.util.Arrays;

public class RearrangeElementsBySign {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] ans = rearrangeArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 0);
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[negIndex] = nums[i];
                negIndex += 2;
            } else {
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
        }
        return ans;
    }
}
