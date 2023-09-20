package Java_Course_DSA.Programs;

import java.util.Arrays;

public class PairGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int targetSum = 4;
        int[] answer = findPair(arr, targetSum);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] findPair(int[] arr, int targetSum) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // here j = i + 1 is used to avoid rechecking pairs with the same elements
                if (arr[i] + arr[j] == targetSum) {
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                }
            }
        }
        return ans;
    }

}
