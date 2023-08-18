package Java_Course_DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(3);
        nums.add(1);
        nums.add(1);
        nums.add(2);
//        int size = nums.size();
//        for (int i = 0; i < size; i++) {
//            System.out.print(nums.get(i) + " ");
//        }

        List<Integer> ans = removeDuplicates(nums);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }

    public static List<Integer> removeDuplicates(List<Integer> nums) {
        List<Integer> ans = new ArrayList<>();
        int size = nums.size();
        ans.add(nums.get(0));
        for (int i = 1; i < size; i++) {
            if (nums.get(i) != nums.get(i - 1)) {
                ans.add(nums.get(i));
            }
        }
        return ans;
    }
}
