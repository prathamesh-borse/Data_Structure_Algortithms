package Java_Course_DSA.Programs;

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

        List<Integer> list = removeDuplicates2(nums);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
//        System.out.println(Arrays.toString(ans));

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


    public static List<Integer> removeDuplicates2(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();

        int[] numsArray = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            numsArray[i] = nums.get(i);
        }

        int n = numsArray.length;
        list.add(numsArray[0]);

        for (int i = 1; i < n; i++) {
            if (numsArray[i] == numsArray[i - 1]) {
                continue;
            } else {
                list.add(numsArray[i]);
            }
        }
        System.out.println(Arrays.asList(list));
        System.out.println(list.size());
        System.out.println(Arrays.toString(numsArray));
        return list;
    }
}
