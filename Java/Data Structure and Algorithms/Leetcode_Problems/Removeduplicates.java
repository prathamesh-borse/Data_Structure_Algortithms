
// 26. Remove Duplicates from Sorted Array

import java.util.ArrayList;
import java.util.List;

public class Removeduplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int size = nums.size();
//        for (int i = 0; i < size; i++) {
//            System.out.print(nums.get(i) + " ");
//        }

//        List<Integer> list = removeDuplicates2(nums);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }

        int answer = removeDuplicates(nums);
        System.out.println(answer);
//        System.out.println(Arrays.toString(ans));

    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    private static List<Integer> removeDuplicates2(int[] nums) {
        int i = 0;
        int j = 0;
        List<Integer> answer = new ArrayList<>();
        int size = nums.length;
        while (i < size) {
            while (j < size && nums[i] == nums[j]) {
                j++;
            }

            answer.add(nums[i]);
            i = j;
        }


        for (int k = 0; k < answer.size(); k++) {
            System.out.print(answer.get(k) + " ");
        }

        return answer;
    }
}