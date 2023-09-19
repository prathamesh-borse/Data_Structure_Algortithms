package Java_Course_DSA.Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = subsets(nums);
        System.out.println(Arrays.asList(list));
    }

    static List<List<Integer>> finalAnswer = new ArrayList<>();
    static List<Integer> currentSubset = new ArrayList<>();

    public static void recur(int[] nums, int index) {
        if (index == nums.length) {
            finalAnswer.add(new ArrayList(currentSubset));
            return;
        }

        currentSubset.add(nums[index]);
        recur(nums, index + 1);

        int lastIndex = currentSubset.size() - 1;
        currentSubset.remove(lastIndex);
        recur(nums, index + 1);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        recur(nums, 0);
        return finalAnswer;
    }
}
